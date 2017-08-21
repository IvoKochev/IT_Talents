import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		int m, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		m = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		n = sc.nextInt();
		if (n < 1 || m < 1) {
			System.out.println("Invalid number of rows or columns!");
		} else {
			int sum = 0;
			int index = 0;
			int maxSum = 0;
			int[][] arr = new int[m][n];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.println("Enter [" + i + "][ " + j + "] element");
					arr[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					sum += arr[i][j];
				}
				if (sum > maxSum) {
					maxSum = sum;
					index = i;
				}
				sum = 0;
			}
			System.out.println("The max sum is: " + maxSum + " and it is on " + index + " row");

		}
		sc.close();
	}
}
