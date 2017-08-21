import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the word that you are searching for: ");
		String word = sc.next();
		String[] words = str.split(" ");
		int index  = -1;
		for(int i = 0; i < words.length; i++) {
			if(words[i].equals(word)) {
				break;
			}
			index += words[i].length() + 1;
		}
		if(index == str.length()) {
			System.out.println("There is no such word");
		} else {
		System.out.println("'" + word + "'" + " is presented at index " + index);
		}
		sc.close();

	}

}
