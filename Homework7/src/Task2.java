import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two words with interval: ");
		str = sc.nextLine();
		if (str.length() < 10 || str.length() > 20) {
			System.out.println("Invalid length of the string!");
		} else {
			// it will throw an exception if there is no " " in the string
			String[] words = str.split(" ");
			if(words.length > 2) {
				System.out.println("Invalid number of words!");
			} else {
				if(words[0].length() > words[1].length()) {
					System.out.print(words[0].length() + " " + words[1].substring(0,5) + words[0].substring(5, words[0].length()));
				} else if(words[1].length() > words[0].length()) {
					System.out.print(words[1].length() + " " + words[0].substring(0,5) + words[1].substring(5, words[1].length()));
				} else {
					System.out.print("The words have the same length!");
				}
			}
		}
		sc.close();

	}

}
