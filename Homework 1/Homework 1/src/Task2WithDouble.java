import java.util.Scanner;

public class Task2WithDouble {

	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a = sc.nextDouble();
		System.out.println("Enter the second different number:");
		b = sc.nextDouble();
		double sum, diference, multiplication, integerDevision, residue;
		sum = a+b;
		diference = a-b;
		multiplication = a*b;
		integerDevision = a/b;
		residue = a%b;
		System.out.println("Sum is: " + sum);
		System.out.println("Diference is: " + diference);
		System.out.println("Multiplication is: " + multiplication);
		System.out.println("Integer Devision is: " + integerDevision);
		System.out.println("Devision with residue is: " + residue);
		sc.close();

	}

}
