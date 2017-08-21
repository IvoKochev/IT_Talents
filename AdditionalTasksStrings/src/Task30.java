import java.util.Scanner;

public class Task30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the word: ");
		String word = sc.next();
		String[] words = str.split(" ");
		String copyStr = "";
		for(int i = 0; i < words.length; i++) {
			if(!words[i].equals(word)) {
				copyStr += words[i] + " ";
			} else {
				continue;
			} 
		}
		System.out.println(copyStr.trim());
		sc.close();

	}

}
