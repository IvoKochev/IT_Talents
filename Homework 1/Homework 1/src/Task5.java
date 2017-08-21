import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a = sc.nextDouble();
		System.out.println("Enter the second number: ");
		b = sc.nextDouble();
		System.out.println("Enter the third number: ");
		c = sc.nextDouble();
		if(a>b && a>c && b>c){
			System.out.println(a+ " " + b + " " + c);
		} else if(a>b && a>c && c>b){
			System.out.println(a+ " " + c + " " + b);
		} else if(b>a && b>c && a>c){
			System.out.println(b + " " + a + " " + c);
		} else if(b>a && b>c && c>a){
			System.out.println(b + " " + c + " " + a);
		} else if(c>a && c>b && a>b){
			System.out.println(c + " " + a + " " + b);
		} else{
			System.out.println(c+ " " + b + " " + a);
		}
		sc.close();

	}

}
