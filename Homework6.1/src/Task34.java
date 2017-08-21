import java.util.Scanner;

public class Task34 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the matrix: ");
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("Invalid number of rows and columns!");
		} else {
			int[][] matrix = new int[n][n];
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.println("Enter the [" + i + "][" + j + "] element of the matrix: ");
					matrix[i][j] = sc.nextInt();
				}
			}
			// holds the element that is being changed
			int temp = 0;
			for (int i = 0; i < matrix.length; i++) {
				for (int j = i; j < matrix[i].length; j++) {
					temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = temp;
				}
			}
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j] + (j == matrix.length - 1 ? "" : ","));
				}
				System.out.println();
			}

		}
		sc.close();

	}
}
