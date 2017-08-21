import java.util.Scanner;

public class Task113 {

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
			int counter = 0;
			for(int i = 0; i < array[0].length; i++) {
				if(i%2 == 0){
				for (int j = 0; j < array.length; j++) {
					array[j][i] = ++counter;
				}
				} else {
					for (int j = array.length-1; j >= 0; j--) {
						array[j][i] = ++counter;
					}
				}
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
