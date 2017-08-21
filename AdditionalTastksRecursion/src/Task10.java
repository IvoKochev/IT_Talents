import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of fibonacci's element: ");
		int n = sc.nextInt();
		System.out.println(fibonacci(n));
		sc.close();

	}
	static int fibonacci(int n) {
		if(n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n-2) + fibonacci(n-1);
		}
	}

}
