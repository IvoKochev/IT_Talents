import java.util.Scanner;

public class Task32 {

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
			boolean isLowerTriangular = true;
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					if (j > i && matrix[i][j] != 0) {
						isLowerTriangular = false;
						break;
					}
				}
			}
			if (isLowerTriangular) {
				System.out.println("The matrix is lower triangular!");
			} else {
				System.out.println("The matrix is not lower triangular!");
			}

		}
		sc.close();

	}
}
