import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = sc.nextInt();
		if(rows > 0 && cols > 0) {
			int[][] arr = new int[rows][cols];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.println("Enter the [" + i + "][" + j + "] element: ");
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println("The sum is " + sum(arr, rows, cols, 0, 0));
			
		} else {
			System.out.println("Invalid number of rows or columns!");
		}
		sc.close();

	}
	static int sum(int[][] arr, int rows, int cols, int i, int j) {
		if(i == rows - 1 && j == cols - 1) {
			return arr[i][j];
		} else {
			if(j < cols-1) {
				return arr[i][j] + sum(arr, rows, cols, i, j+1);
			} else {
				return arr[i][j] + sum(arr, rows, cols, i+1, 0);
			}
		}
	}

}
