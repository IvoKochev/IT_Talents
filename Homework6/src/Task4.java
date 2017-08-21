import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of the array: ");
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("Invalid number of elements!");
		} else {
			int cnt = 0;
			boolean isOk = true;
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the [" + i + "] element: ");
				arr[i] = sc.nextInt();
				if (arr[i] < 0 || arr[i] > 1) {
					System.out.println("Invalid element!");
					isOk = false;
					break;
				}

			}
			if (isOk) {
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == 0) {
						cnt++;
					}
				}
				for (int i = 0; i < arr.length; i++) {
					if (i < cnt) {
						arr[i] = 0;
					} else {
						arr[i] = 1;
					}
				}
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + (i == arr.length - 1 ? "" : ","));
				}
			}

		}
		sc.close();
	}
}
