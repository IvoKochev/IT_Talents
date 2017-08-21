import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter the first number");
		a = sc.nextDouble();
		System.out.println("Please, enter the second number");
		b = sc.nextDouble();
		System.out.println("Please, enter the third number");
		c = sc.nextDouble();
		if(c>a && c>b){
			System.out.println("The number c is bigger than a and b");
		} else if(c>a && c<b){
			System.out.println("The number c is between a and b");
		} else if(c<a && c>b){
			System.out.println("The number c is between a and b");
		} else {
			System.out.println("The number c is smaller than a and b");
		}
		sc.close();

	}

}
