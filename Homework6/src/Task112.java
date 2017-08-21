import java.util.Scanner;

public class Task112 {

	public static void main(String[] args) {
		int n, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		n = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		m = sc.nextInt();
		if (n < 1 || m < 1) {
			System.out.println("Invalid number of rows or columns!");
		} else {
			int[][] array = new int[n][m];
			int sum = 0;
			int counter = 0;
			for(int s = 0; s < (n + m - 1); s++) {
				for (int i = 0; i < array[0].length; i++) {
					for (int j = 0; j < array.length; j++) {
						if((i+j) == sum) {
							array[j][i] = ++counter;
							
						}
						
					}
				}
				sum++;

			}
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + (j == array[i].length-1 ? "" : ","));
				}
				System.out.println();
			}

		}
		sc.close();

	}
}
