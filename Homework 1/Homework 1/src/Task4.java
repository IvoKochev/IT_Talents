import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a = sc.nextDouble();
		System.out.println("Enter the second number: ");
		b = sc.nextDouble();
		if(a>b){
			System.out.println("The first number " + a + " is bigger than the second number " + b);
		} else if(b>a){
			System.out.println("The second number " + b + " is bigger than the first number " + a);
		}
		sc.close();
	}

}
