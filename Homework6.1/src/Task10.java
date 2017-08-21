import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of elements: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("Invalid number of elements! ");

		} else {
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter the [" + i + "] element: ");
				array[i] = sc.nextInt();
			}
			int count = 0, count2 = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == 0) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println("Duplicate: 0");
			}
			count = 0;
			for (int i = 0; i < array.length; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] == array[j] && array[i] != 0) {
						array[j] = 0;
						count++;
						count2++;
					}
				}
				if (count > 0) {
					System.out.println("Duplicate: " + array[i]);
				}
				count = 0;

			}
			if (count2 == 0) {
				System.out.println("There are no duplicates!");
			}
		}
		sc.close();

	}

}
