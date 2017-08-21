import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		System.out.println("Enter the string!");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String temp = "";
		int index = str.length()-1;
		if(str.equals(palindrome(str, temp, index))) {
			System.out.println("Palindrome");
		} else{
			System.out.println("Not a palindrome!");
		}
		sc.close();

	}
	static String palindrome(String str, String temp, int index) {
		if(index == 0) {
			return str.charAt(index) + "";
		} else {
			return temp = str.charAt(index) + palindrome(str, temp, index-1);
		}
	}
}
