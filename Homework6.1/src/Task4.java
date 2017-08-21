import java.util.Scanner;

public class Task4 {

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
			System.out.println("Enter the element: ");
			int element = sc.nextInt();
			boolean isThere = false;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == element) {
					isThere = true;
					System.out.println("Your element is on position [" + i + "]");
				}
			}
			if (!isThere) {
				System.out.println("The array doesn't contain your element!");
			}

		}
		sc.close();
	}
}
