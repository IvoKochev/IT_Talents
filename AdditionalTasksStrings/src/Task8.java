import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int vowels = 0;
		int consonants = 0;
		int ascii = 0;
		for(int i = 0; i < str.length(); i++) {
			ascii = (int) str.charAt(i);
			if(ascii == 65 || ascii == 69 || ascii == 73 || ascii == 79 || ascii == 85 || ascii == 89 || ascii == 65+32 || ascii == 69+32 || ascii == 73 +32 || ascii == 79 + 32 || ascii == 85+32 || ascii == 89 + 32) {
				vowels++;
			} else if(((ascii >= 65 && ascii <= 90) && ascii != 65 && ascii != 69 && ascii != 73 && ascii != 79 && ascii != 85 && ascii != 89 || (ascii >= 97 && ascii <= 122) && ascii != 65+32 && ascii != 69+32 && ascii != 73 +32 && ascii != 79 + 32 && ascii != 85+32 && ascii != 89 + 32 )) {
				consonants ++;
			}
		}
		System.out.println("Total vowels: " + vowels);
		System.out.println("Total consonants: " + consonants);
		sc.close();

	}

}
