import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter n: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n > 0) {
		System.out.println(fibbonaci(n));
		} else {
			System.out.println("Invalid numer of element of Fibbonaci!");
		}
		sc.close();

	}
	static int fibbonaci(int n) {
		if(n == 1) {
			return 1;
		} 
		if(n == 2) {
			return 1;
		}
		else {
			return fibbonaci(n-1) + fibbonaci(n-2);
		}
	}

}
