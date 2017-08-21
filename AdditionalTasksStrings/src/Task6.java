import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		for(int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			int ascii = (int) a;
			if(ascii >=65 && ascii <=90) {
				System.out.println("The character '" + str.charAt(i) + "' on position " + i + " is an upper letter.");
			} else if(ascii >= 97 && ascii <= 122) {
				System.out.println("The character '" + str.charAt(i) + "' on position " + i + " is a lower letter.");
			}
			
		}
		sc.close();

	}

}
