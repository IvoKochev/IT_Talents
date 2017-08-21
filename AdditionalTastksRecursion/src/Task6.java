import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if(n > 0 ) {
			int mnojitel = 1;
			for(int i = 0; i < 10; i++) {
				if(n / mnojitel > 10) {
					mnojitel *= 10;
				} else {
					break;
				}
			}

			System.out.println(reverseNumber(n, mnojitel));
		}
		sc.close();

	}
	static int reverseNumber(int n, int mnojitel) {
		if(n < 10) {
			return n;
		} else {
			int result =0;
			result += (n%10) * mnojitel;
			System.out.println("result: " + result);
			return result + reverseNumber(n/10, mnojitel/10);
		}
	}

}
