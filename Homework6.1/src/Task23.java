import java.util.Scanner;

public class Task23 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the matrix: ");
		n = sc.nextInt();
		if(n < 1) {
			System.out.println("Invalid number of rows and columns!");
		} else {
			int[][] matrix = new int[n][n];
			int[][] matrix1 = new int[n][n];
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix[i].length; j++) {
					System.out.println("Enter the [" + i + "][" + j + "] element of the first matrix: ");
					matrix[i][j] = sc.nextInt();
				}
			}
			for(int i = 0; i < matrix1.length; i++) {
				for(int j = 0; j < matrix1[i].length; j++) {
					System.out.println("Enter the [" + i + "][" + j + "] element of the second matrix: ");
					matrix1[i][j] = sc.nextInt();
				}
			}
			System.out.println("If matrix 1: ");
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("And matrix 2:");
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1[i].length; j++) {
					System.out.print(matrix1[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Diference of both matrix: ");
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j] - matrix1[i][j] + " ");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
