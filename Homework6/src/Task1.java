import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of the array: ");
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("Invalid number of elements!");
		} else {
			int[] arr = new int[n];
			boolean isPositive = true;
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the [" + i + "] element: ");
				arr[i] = sc.nextInt();
				if (arr[i] <= 0) {
					isPositive = false;
				}

			}
			if (isPositive) {
				System.out.println("There is no negative element!");
			} else {
				System.out.println("There is a negative element!");
			}

		}
		sc.close();

	}
}