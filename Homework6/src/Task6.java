import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns: ");
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("Invalid number of rows and columns!");
		} else {
			int[][] arr = new int[n][n];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.println("Enter the [" + i + "][" + j + "] element:");
					arr[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i][i] + (i == arr.length - 1 ? "" : ","));
			}

		}
		sc.close();

	}
}