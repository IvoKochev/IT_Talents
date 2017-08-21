import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		if (n > 0) {
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the [" + i + "] element: ");
				arr[i] = sc.nextInt();
			}
			System.out.println("The most duplicated element is " + duplicate(arr, 0, 0, 0, 0, 0));

		} else {
			System.out.println("Invalid number of elements!");
		}
		sc.close();

	}

	static int duplicate(int[] arr, int start, int start1, int cnt, int maxCnt, int element) {
		if (start == arr.length - 1 && start1 == arr.length - 1) {
			return element;
		} else {
			if (arr[start] == arr[start1]) {
				cnt++;
			}
			if (start1 < arr.length - 1) {
				return duplicate(arr, start, start1 + 1, cnt, maxCnt, element);

			} else {
				if (cnt > maxCnt) {
					maxCnt = cnt;
					element = arr[start];
					cnt = 0;
				}
				return duplicate(arr, start + 1, 0, 0, maxCnt, element);
			}
		}

	}
}
