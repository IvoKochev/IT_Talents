import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if(n > 0) {
			System.out.print("Odd numbers: ");
			printOddNumbers(n);
			System.out.print("Even numbers: ");
			printEvenNumbers(n);
		} else {
			System.out.println("Invalid number!");
		}
		sc.close();

	}
	static void printOddNumbers(int n) {
		if(n < 0) {
			return;
		} else if(n % 2 != 0) {
			System.out.print(n + (n == 1 ? "\n" : ", "));
			printOddNumbers(n-2);
		} else {
			printOddNumbers(n-1);
		}
	}
	static void printEvenNumbers(int n ) {
		if(n == 0) {
			return;
		} else if(n % 2 == 0) {
			System.out.print(n + (n == 2 ? "" : ", "));
			printEvenNumbers(n-2);
		} else {
			printEvenNumbers(n-1);
		}
	}
}
