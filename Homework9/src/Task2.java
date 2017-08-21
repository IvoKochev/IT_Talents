import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of elements of the array: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n > 0) {
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the [" + i + "] element:");
				arr[i] = sc.nextInt();
			}
			sortArray(arr);
		} else {
			System.out.println("Invalid number of elements!");
		}
		sc.close();

	}
	static void sortArray(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		int[] helper = new int[max+1];
		for (int i = 0; i < arr.length; i++) {
			helper[arr[i]]++;
		}
		int longestLanding = 0;
		int numberOfLandings = 0;
		for(int i = 0; i < helper.length; i++) {
			if(helper[i] > longestLanding) {
				longestLanding = helper[i];
			}
			if(helper[i] > 1) {
				numberOfLandings++;
			}
		}
		System.out.println("The longest landing is " + longestLanding + " elements.");
		System.out.println("The number of landings is " + numberOfLandings);
	}

}
