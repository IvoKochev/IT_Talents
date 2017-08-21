import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = sc.nextInt();
		System.out.println("Enter b: ");
		b = sc.nextInt();
		if(a > 0 && b >0) {
			triangle(a, b);
		} else {
			System.out.println("Invalid number!");
		}
		sc.close();

	}
	static void triangle(int a, int b) {
		if(a <= b){
		for(int i = 1; i <= a; i++){
			System.out.print(i);
		} 
		System.out.println();
		triangle(a+1, b);
		}
	}

}
