import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the matrix: ");
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("Invalid number of rows and columns!");
		} else {
			int[][] matrix = new int[n][n];
			int[][] matrix1 = new int[n][n];
			// sums the value of the elements
			int sum = 0;
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.println("Enter the [" + i + "][" + j + "] element of the first matrix: ");
					matrix[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1[i].length; j++) {
					System.out.println("Enter the [" + i + "][" + j + "] element of the second matrix: ");
					matrix1[i][j] = sc.nextInt();
				}
			}
			// use it as the second index of matrix1 when summing
			int index = 0;
			// use it as the second index of matrix when summing
			int index2 = 0;
			System.out.println("The product of both matrices: ");
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					for (int k = 0; k < matrix.length; k++) {
						sum += matrix[i][index2] * matrix1[index][j];
						index++;
						index2++;
					}
					System.out.print(sum + " ");
					index = 0;
					index2 = 0;
					sum = 0;
				}
				System.out.println();
			}

		}
		sc.close();

	}
}
