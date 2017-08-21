import java.util.Scanner;

public class Task33 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the matrix: ");
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("Invalid number of rows and columns!");
		} else {
			int[][] matrix = new int[n][n];
			boolean isUpperTriangular = true;
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.println("Enter the [" + i + "][" + j + "] element of the matrix: ");
					matrix[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					if (i > j && matrix[i][j] != 0) {
						isUpperTriangular = false;
						break;
					}
				}
			}
			if (isUpperTriangular) {
				int sum = 0;
				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix[i].length; j++) {
						if (j > i) {
							sum += matrix[i][j];
						}
					}
				}
				System.out.println("Sum of upper triangular matrix: " + sum);
			} else {
				System.out.println("The matrix is not upper triangular!");
			}

		}
		sc.close();

	}
}