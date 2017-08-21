import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of elements of the array: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n > 0) {
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the [" + i + "] element: ");
				arr[i] = sc.nextInt();
			}
			sortedArray(arr);
		}
		sc.close();

	}
	static void sortedArray(int[] arr) {
		boolean isSorted = true;
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				isSorted = false;
				System.out.println(arr[i] + " > " + arr[i+1]);
			}
		}
		if(isSorted) {
			System.out.println("The array is sorted!");
		} else {
			System.out.println("The array isn't sorted!");
		}
	}

}
