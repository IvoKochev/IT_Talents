import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the word that you are searching for: ");
		String word = sc.next();
		String[] words = str.split(" ");
		int index  = str.length()-1;
		for(int i = words.length-1; i >= 0; i--) {
			index = index - (words[i].length() );
			if(words[i].equals(word)) {
				break;
			}
			
		}
		if(index == 0) {
			System.out.println("There is no such word");
		} else {
		System.out.println(index);
		}
		sc.close();

	}

}
