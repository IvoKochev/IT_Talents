import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of rows and columns: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("Invalid number of rows or columns!");
		} else {
			boolean isTrue = false;
			boolean[][] arr = new boolean[n][n];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.println("Enter the [" + i + "] [" + j + "] element: ");
					arr[i][j] = sc.nextBoolean();
				}
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (j > i && arr[i][j]) {
						isTrue = true;
						System.out.println("There is true");
						break;
					}
				}
			}
			if (!isTrue) {
				System.out.println("There is no true!");
			}
		}
		sc.close();
	}
}