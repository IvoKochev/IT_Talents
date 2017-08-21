import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		int number, spaceNumber, starsNumber = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		number = sc.nextInt();
		spaceNumber = number - 1;
		for(int i = 1; i < number; i++){
			for(int j = 0; j <spaceNumber; j++){
				System.out.print(" ");
			}
			for(int p = 0; p <starsNumber; p++){
				System.out.print("*");
			}
			spaceNumber -= 1;
			starsNumber += 2;
			System.out.println();
		}
		sc.close();

	}

}
