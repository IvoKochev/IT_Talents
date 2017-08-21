import java.util.Scanner;

public class Task29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the word: ");
		String word = sc.next();
		String[] words = str.split(" ");
		int counter = 0;
		for(int i = 0; i < words.length; i++) {
			if(words[i].equals(word)) {
				counter ++;
			}
		}
		if(counter == 0 ) {
			System.out.println("There is no such word!");
		} else {
			System.out.println("Total occurences of '" + word + "': " + counter );
		}
		sc.close();



	}

}
