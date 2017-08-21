import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = sc.nextInt();
		if (rows > 0 && cols > 0) {
			int[][] arr = new int[rows][cols];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.println("Enter the [" + i + "][" + j + "] element: ");
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(duplicate(arr, rows, cols, 0, 0, 0, 0, 0, 0, 0));

		} else {
			System.out.println("Invalid number of rows or columns!");
		}
		sc.close();

	}
	//i - index po redove, j - index po koloni, k - index po redove za sravnenie, s - index po koloni za sravnenie
	static int duplicate(int[][] arr, int rows, int cols, int i, int j, int k, int s, int element, int maxCnt, int cnt) {
		if(i == rows-1 && k == rows-1 && j == cols-1 && s == cols-1) {
			return element;
		}else if(k == rows - 1 && s == cols - 1) {
			if(cnt > maxCnt) {
				maxCnt = cnt;
				element = arr[i][j];
				cnt = 0;
			}
			 if(j < cols - 1) {
				 return duplicate(arr, rows, cols, i, j+1, 0, 0, element, maxCnt, 0);
			 } else {
				 return duplicate(arr, rows, cols, i+1, 0, 0, 0, element, maxCnt, 0);
			 }
		} else {
			if(arr[i][j] == arr[k][s]) {
				cnt++;
			}
			if(s < cols - 1) {
				return duplicate(arr, rows, cols, i, j, k, s+1, maxCnt, element, cnt);
			} else {
				return duplicate(arr, rows, cols, i, j, k+1, 0, maxCnt, element, cnt);
			}
		}
	}

}
