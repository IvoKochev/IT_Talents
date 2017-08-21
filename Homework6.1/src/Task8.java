import java.util.Scanner;

public class Task8 {

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
			// min+1 and max+1 because that way they always get the value of
			// array[0]
			int min = array[0] + 1;
			int max = array[0] - 1;
			for (int i = 0; i < array.length; i++) {
				if (array[i] > max) {
					max = array[i];
				}
				if (min > array[i]) {
					min = array[i];
				}
			}
			System.out.println("The max element is: " + max);
			System.out.println("The min element is: " + min);

		}
		sc.close();

	}
}
