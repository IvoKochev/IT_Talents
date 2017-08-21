import java.util.Scanner;

public class Task52 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a = sc.nextInt();
		System.out.println("Enter the second number: ");
		b = sc.nextInt();
		if(a < 0 || b < 0) {
			System.out.println("Invalid numbers!");
		} else if(a > b){
			printNumbers(b, a);
		} else if(b > a){
		printNumbers(a, b);
		} else if( a == b) {
			System.out.println("Your numbers are equal!");
		}
		sc.close();
	}
	static void printNumbers(int a, int b) {
		if(a > b) {
			return;
		} else{
			System.out.println(getNumbers(a, b));
			printNumbers(a+1, b);
		}
		
	}
	static String getNumbers(int a, int b) {
		if(a == 0 || a > b) {
			return "";
		} else{
			return   getNumbers(a-1, b) +"" + a;
		}
	}

}
