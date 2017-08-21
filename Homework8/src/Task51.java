import java.util.Scanner;

public class Task51 {

	public static void main(String[] args) {
		String str;
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		System.out.println("The string " + str + " is " + (isPalindrome(str, 0, str.length()-1) == true ? "a palindrome!" : "not a palindrome!"));
		sc.close();	

	}
	static boolean isPalindrome(String str, int firstIndex, int secondIndex) {
		if(firstIndex >= (str.length()-1)/2) {
			return true;
		} else{
			if(str.charAt(firstIndex) != str.charAt(secondIndex)) {
				return false;
			} else{
			return isPalindrome(str, firstIndex + 1, secondIndex - 1);
			}
		}
	} 

}
