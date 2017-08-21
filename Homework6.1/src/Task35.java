import java.util.Scanner;

public class Task35 {

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
			boolean isIdentity = true;
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					if(matrix[i][i] != 1) {
						isIdentity = false;
						break;
					} else if(i!=j && matrix[i][j] != 0) {
						isIdentity = false;
						break;
					}
				}
			}
			if(isIdentity) {
				System.out.println("The matrix is identity!");
			} else {
				System.out.println("The matrix is not indentity!");
			}

	}
		sc.close();

}
}