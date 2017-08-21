import java.util.Scanner;

public class Task16 {

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
			printFrequency(arr, 0, 0);

		} else {
			System.out.println("Invalid number of elements!");
		}
		sc.close();

	}
	static void printFrequency(int[] arr, int start, int zeroCnt) {
		if(start == arr.length) {
			return;
		} else {
			int counter = 0;
			if(zeroCnt == 0) {
				for(int i = 0; i < arr.length; i++) {
					for(int j = i; j < arr.length; j++) {
						if(arr[i] == arr[j] && arr[i] == 0) {
							counter++;
						}
					}
					if(counter > 0) {
						System.out.println("Frequency of 0 is " + counter);
						counter = 0;
						break;
					}
				}
				zeroCnt++;
				printFrequency(arr, start, zeroCnt);
			} else {
				counter = 1;
				for(int i = start + 1; i < arr.length; i++) {
					if(arr[start] == arr[i] && arr[start] != 0) {
						counter ++;
						arr[i] = 0;
					}
				}
				if(arr[start] != 0) {
				System.out.println("Frequency of " + arr[start] + " is " + counter);
				}
				counter = 1;
				printFrequency(arr, start + 1, zeroCnt);
			}
		}
	}

}
