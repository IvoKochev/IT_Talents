import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			for (int k = 0; k < number - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
