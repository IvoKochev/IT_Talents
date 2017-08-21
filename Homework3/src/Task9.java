import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		int number, spaceNumber, starsNumber = 1, innerSpace = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		number = sc.nextInt();
		spaceNumber = number - 1;
		for (int i = 1; i <= number; i++) {
			for (int j = 0; j < spaceNumber; j++) {
				System.out.print(" ");
			}
			if (i == 1 || i == number) {
				for (int p = 0; p < starsNumber; p++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for (int s = 0; s < innerSpace; s++) {
					System.out.print(" ");
				}
				System.out.print("*");
				innerSpace += 2;
			}
			spaceNumber -= 1;
			starsNumber += 2;
			System.out.println();
		}
		sc.close();

	}

}
