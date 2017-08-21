import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		double a, b, c, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a = sc.nextDouble();
		System.out.println("Enter the second number: ");
		b = sc.nextDouble();
		System.out.println("Enter the third number: ");
		c = sc.nextDouble();
		d = a;
		a = b;
		b = c;
		c = d;
		System.out.println("The first number is is: " +a + " the second number is " + b + " the third is: " + c);
		sc.close();
	}

}
