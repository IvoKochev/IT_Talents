import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of elements: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("Invalid number of elements! ");

		} else {
			
			int[] array = new int[n];
			int counter = 0;
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter the [" + i + "] element: ");
				array[i] = sc.nextInt();
			}
			System.out.println("Enter the specific value, that you want to check: ");
			int value = sc.nextInt();
			for (int i = 0; i < array.length; i++) {
				if (array[i] == value) {
					counter++;
				}
			}
			if (counter > 0) {
				System.out.println("The array contains the specifil value " + value + " " + counter + (counter == 1 ? " time" : " times"));
			} else {
				System.out.println("The array doesn't contain the specific value " + value);
			}

		}
		sc.close();

	}
}
