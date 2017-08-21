import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		int rows, cols;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		rows = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		cols = sc.nextInt();
		if(rows > 0 && cols > 0) {
			int[][] array = new int[rows][cols];
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.println("Please enter the [" + i + "][" + j +"] element: ");
					array[i][j] = sc.nextInt();
				}
			}
			sortArray(array, rows, cols);
			System.out.println("The sorted array: ");
			for(int i = 0; i < array.length; i++) {
				for(int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + (j == array[i].length -1 ? "" : ","));
				}
				System.out.println();
			}
		} else {
			System.out.println("Invalid number of rows or columns!");
		}
		sc.close();

	}
	static void sortArray(int[][] arr, int rows, int cols) {
		int temp;
		for(int k = 0; k < rows*cols; k++) {
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length-1; j++) {
					if(arr[i][j] > arr[i][j+1]) {
						temp = arr[i][j];
						arr[i][j] = arr[i][j+1];
						arr[i][j+1] = temp;
					} else if(i > 0 && j == 0 && arr[i-1][arr[i].length-1] > arr[i][j]) {
						temp = arr[i-1][arr[i].length-1];
						arr[i-1][arr[i].length-1] = arr[i][j];
						arr[i][j] = temp;
					}
				}
			}
		}

		}
		
	

}
