import java.util.Scanner;

public class Task14 {

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
			reverse(arr, 0);
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + (i == arr.length-1 ? "" : ", "));
			}

		} else {
			System.out.println("Invalid number of elements!");
		}
		sc.close();

	}
	static void reverse(int[] arr, int start) {
		if(start > arr.length/2) {
			return;
		} else {
			int temp = arr[start];
			arr[start] = arr[arr.length-1 - start];
			arr[arr.length-1-start] = temp;
			reverse(arr, start + 1);
		}
	}
}
