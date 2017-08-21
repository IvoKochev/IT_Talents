import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		n = sc.nextInt();
		if(n<1){
			System.out.println("Invalid length of the array!");
		} else{
			int[][] array = new int[n][n];
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.println("Please enter the [" + i + "] [" + j + "] element:");
					array[i][j] = sc.nextInt();
					if(array[i][j] < 0){
						System.out.println("Invalid number!");
					}
				}
				
			}
			for (int i = 0;  i< array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					if(i == j){
						System.out.print(array[i][j] +" ");
					}
				}
			}
			System.out.println();
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					if((i + j) == array.length - 1 ){
						System.out.print(array[i][j] + " ");
					}
				}
			}
		}
		sc.close();

	}

}
