import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		a = sc.nextInt();
		System.out.println("Enter the number of the bit you want to invert: ");
		b = sc.nextInt();
		System.out.println("Enter the number of the bit you want to invert: ");
		c = sc.nextInt();
		a = a^(1<<b);
		a = a^(1<<c);
		System.out.println(a);
		sc.close();
				

	}

}
