import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		str = sc.next();
		//index from the begining
		int index = 0;
		//index2 from the end
		int index2 = str.length()-1;
		boolean isPalindrome = true;
		for(int i = 0; i < str.length()/2; i++) {
			if(str.charAt(index) != str.charAt(index2)) {
				isPalindrome = false;
			}
			index ++;
			index2--;
		}
		if(isPalindrome) {
			System.out.println("The word " + str + " is a palindrome!");
		} else {
			System.out.println("The word " + str + " isn't a palindrome!");
		}
		sc.close();
	}

}
