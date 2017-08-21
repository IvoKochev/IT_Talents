import java.util.Scanner;

public class Task24 {

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
			System.out.println("Enter the number, that you want to multiply the matrix with: ");
			// the number that is being multiplied with the matrix
			int number = sc.nextInt();
			System.out.println("If matrix A = ");
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j] + (j == matrix[i].length - 1 ? "\n" : ","));
				}
				// System.out.println();
			}
			System.out.println("Output: " + number + " x A");
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j] * number + (j == matrix[i].length - 1 ? "\n" : ","));
				}
				// System.out.println();
			}

		}
		sc.close();

	}
}
