import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		if(n > 0) {
			int[] arr = new int[n];
			for(int i = 0; i < arr.length; i++) {
				System.out.println("Enter the [" + i + "] element: ");
				arr[i] = sc.nextInt();
			}
			System.out.println("Maximum element is: " + maxElement(arr, 0));
			System.out.println("Minimum element is: " + minElement(arr, 0));
		} else {
			System.out.println("Invalid number of elements!");
		}
		sc.close();

	}
	static int maxElement(int[] arr, int start) {
		if(start == arr.length-1) {
			return arr[start];
		} else {
			if(arr[start] > maxElement(arr, start+1)) {
				return arr[start];
			} else {
				return maxElement(arr, start + 1);
			}
		}
	}
	static int minElement(int[] arr, int start) {
		if(start == arr.length-1) {
			return arr[start];
		} else {
			if(arr[start] < minElement(arr, start+1)) {
				return arr[start];
			} else {
				return minElement(arr, start+1);
			}
		}
	}
}
