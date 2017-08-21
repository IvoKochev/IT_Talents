import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if(n > 0) {
			System.out.println("Sum of odd numbers between 1 and " + n + " : " +sumOddNumbers(n));
			System.out.println("Sum of even numbers between 1 and " + n + " : " + sumEvenNumbers(n));
		} else {
			System.out.println("Invalid number!");
		}
		sc.close();

	}
	static int sumOddNumbers(int n) {
		if(n == 1) {
			return n;
		} else if(n % 2 != 0) {
			return n + sumOddNumbers(n-2);
		} else {
			return sumOddNumbers(n-1);
		}
	}
	static int sumEvenNumbers(int n) {
		if(n == 2) {
			return n;
		} else if(n % 2 == 0) {
			return n + sumEvenNumbers(n-2);
		} else {
			return sumEvenNumbers(n-1);
		}
	}
}
