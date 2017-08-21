import java.util.Scanner;

public class Task81 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println(sumDigits(n));
		sc.close();
	}
	static int sumDigits(int n) {
		int sum = 0;
		if(n / 10 > 0) {
			sum += n%10;
			return sum + sumDigits(n/10);
		} else {
			return 1;
		}
	}

}
