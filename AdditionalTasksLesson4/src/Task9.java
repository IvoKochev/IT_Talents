import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		int rows, dotNumber, numbers = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		rows = sc.nextInt();
		dotNumber = rows - 1;
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j<= dotNumber; j++){
				System.out.print(".");
			}
			for(int s = 0; s < numbers; s++){
				System.out.print(i);
			}
			numbers++;
			dotNumber--;
			System.out.println();
		}

	}

}
