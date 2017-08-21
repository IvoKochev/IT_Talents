import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		int number, tempNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		number = sc.nextInt();
		tempNumber = number - 1;
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				System.out.print(tempNumber);
			}
			System.out.print("\n");
			tempNumber += 2;
			
		}
		sc.close();

	}

}
