import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int alphabets = 0;
		int digits = 0;
		int specialChars = 0;
		for(int i = 0; i < str.length(); i++) {
			int ascii = (int) str.charAt(i);
			if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <=122)) {
			alphabets++;	
			} else if(ascii >= 48 && ascii <= 57) {
				digits++;
			} else {
				specialChars++;
			}
		}
		System.out.println("Alphabets: " + alphabets);
		System.out.println("Digits: " + digits);
		System.out.println("Special characters: " + specialChars);
		System.out.println("Total length: " + str.length());
		sc.close();

	}

}
