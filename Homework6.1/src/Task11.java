import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		int n, n1;
		System.out.println("Enter the number of elements of the first array: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the number of elements of the second array:");
		n1 = sc.nextInt();
		if (n < 1 || n1 < 1) {
			System.out.println("Invalid number of elements! ");

		} else {
			int[] array = new int[n];
			int[] array1 = new int[n1];
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter the [" + i + "] element of the first array: ");
				array[i] = sc.nextInt();
			}
			for (int i = 0; i < array1.length; i++) {
				System.out.println("Enter the [" + i + "] element of the second array:");
				array1[i] = sc.nextInt();
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array1.length; j++) {
					if (array[i] == array1[j] && array[i] == 0) {
						System.out.println(array[i] + " is common");
						break;
					}
				}
			}
			int count = 0;
			for (int i = 0; i < array.length; i++) {
				for (int j = i+1; j < array1.length; j++) {
					if (array[i] == array1[j] && array[i] != 0) {
						array1[j] = 0;
						count++;
					}
				}
				if (count > 0) {
					System.out.println(array[i] + " is common!");
				}
				count = 0;
			}

		}
		sc.close();

	}
}
