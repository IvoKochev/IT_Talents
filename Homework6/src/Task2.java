import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of the array:");
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("Invalid number of elements!");
		} else {
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the [" + i + "] element: ");
				arr[i] = sc.nextInt();
			}
			for (int i = 1; i < arr.length - 1; i += 2) {
				if (!((arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) || (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]))) {
					System.out.println("Not zig-zag");
					break;
				} else if (i == arr.length - 2 || i == arr.length - 3) {
					System.out.println("Zig-zag");
				}

			}

		}
		sc.close();
	}
}