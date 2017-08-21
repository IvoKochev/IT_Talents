import java.util.Scanner;

public class Task29 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the matrix: ");
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("Invalid number of rows and columns!");
		} else {
			int[][] matrix = new int[n][n];
			int rowSum = 0;
			int colSum = 0;
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.println("Enter the [" + i + "][" + j + "] element of the matrix: ");
					matrix[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					rowSum += matrix[i][j];
					colSum += matrix[j][i];
				}
				System.out.println("Sum of row " + (i+1) + ": " + rowSum);
				System.out.println("Sum of col: " + (i+1) + ": " + colSum);
				rowSum = 0;
				colSum = 0;
			}

	}
		sc.close();

}
}
