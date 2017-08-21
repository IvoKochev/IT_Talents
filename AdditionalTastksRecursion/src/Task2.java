import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if(n > 0) {
			printNumbers(n, 1);
		} else {
			System.out.println("Invalid number!");
		}
		sc.close();

	}
	static void printNumbers(int n, int start) {
		if(start > n) {
			return;
		} else {
			System.out.print(start + (start == n ? " " : ", "));
			printNumbers(n, start+1);
		}
	}

}
