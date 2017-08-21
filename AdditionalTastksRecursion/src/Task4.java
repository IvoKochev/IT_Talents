import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if(n > 0) {
			System.out.println(sum(n));
		} else {
			System.out.println("Invalid number!");
		}
		sc.close();

	}
	static int sum(int n) {
		if(n == 1) {
			return n;
		} else {
			return n + sum(n-1);
		}
	}

}
