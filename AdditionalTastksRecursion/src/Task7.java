import java.util.Scanner;

public class Task7 {

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

			System.out.println(palindrome(n, mnojitel) == n ? "Palindrome!" : "Not a palindrome!");
		}
		sc.close();

	}
	static int palindrome(int n, int mnojitel) {
		if(n < 10) {
			return n;
		} else {
			int result =0;
			result += (n%10) * mnojitel;
			return result + palindrome(n/10, mnojitel/10);
		}
	}

	}


