import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the matrix: ");
		n = sc.nextInt();
		if(n<1){
			System.out.println("Invalid number of rows and columns!");
		} else{
			int[][] array= new int[n][n];
			int[][] reversedArr = new int[n][n];
			for(int i = 0; i < array.length; i++){
				for(int j = 0; j < array[i].length; j++){
					System.out.println("Enter the [" + i +"][" + j + "] element: ");
					array[i][j] = sc.nextInt();
				}
			}
			int k = 0, s = 0;
			for(int i = 0; i < array.length;i++){
				k = array.length - 1;
				s = i;
				for(int j = 0; j < array[i].length; j++){
					reversedArr[i][j] = array[k][s];
					k--;
				}
			}
			for (int i = 0; i < reversedArr.length; i++) {
				for (int j = 0; j < reversedArr[i].length; j++) {
					System.out.print(reversedArr[i][j] + (j == array[i].length-1 ? "" : ","));
				}
				System.out.println();
				
			}
			
		}
		sc.close();

	}

}
