import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("Invalid number of elements!");
		} else {
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter the [" + i + "] element: ");
				array[i] = sc.nextInt();
			}
			int count = 0;
			for (int i = 0; i < array.length - 1; i++) {
					if (array[i] == 0) {
						count++;
				}
				
			}
			if(count>0) {
				System.out.println("Frequency of 0: " + count);
			}
			count = 1;
			for (int i = 0; i < array.length; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] == array[j] && array[i] != 0) {
						count++;
						array[j] = 0;
					}
				}
				if(array[i] != 0) {
				System.out.println("Frequency of " + array[i] + ": " + count);
				}
				count = 1;
			}

			sc.close();
		}

	}
}
