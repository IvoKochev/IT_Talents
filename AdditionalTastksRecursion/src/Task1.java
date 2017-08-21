import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("Enter the power: ");
		int power = sc.nextInt();
		if(n > 0) {
			System.out.println(n + "^" + power + " is " +power(n, power));
		} else {
			System.out.println("Invalid number!");
		}
		sc.close();
	}
	static int power(int n, int power) {
		if(power == 1) {
			return n;
		} else {
			return n * power(n, power-1);
		}
	}

}
