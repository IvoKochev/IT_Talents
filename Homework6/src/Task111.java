import java.util.Scanner;

public class Task111 {
	public static void main(String[] args) {
		int n, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		n = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		m = sc.nextInt();
		if(n < 1 || m < 1) {
			System.out.println("Invalid number of rows or columns!");
		} else {
			int[][] array = new int[n][m];
			int counter= 0;
			for (int i = 0; i < array.length; i++) {
				counter = i +1;
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = counter;
					counter+=array.length;
					System.out.print(array[i][j] + (j == array[i].length-1 ? "" : ","));
				}
				System.out.println();
				
				
			}
	}
		sc.close();
}
}

