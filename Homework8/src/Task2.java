import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = sc.nextInt();
		System.out.println("Enter b: ");
		b = sc.nextInt();
		if(a >= 2 && b >= 2) {
		System.out.println(sum(a, b));
		} else {
			System.out.println("Invalid numbers!");
		}
		sc.close();
		

	}
	static int sum(int a, int b) {
		if(b == 1) {
			return a;
		}
		return a + sum(a, b-1);
	}

}
