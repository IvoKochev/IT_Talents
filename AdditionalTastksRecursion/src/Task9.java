import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("Factorial of " + n + " is " + factorial(n));
		sc.close();

	}
	static int factorial(int n) {
		if(n == 1) {
			return n;
		} else {
			return n * factorial(n-1);
		}
	}

}
