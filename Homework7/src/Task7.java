import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the words with intervals: ");
		str = sc.nextLine();
		int maxLength = 0;
		String[] words = str.split(" ");
		for(int i = 0; i < words.length; i ++) {
			if(words[i].length() > maxLength) {
				maxLength = words[i].length();
			}
			
		}
		System.out.println(words.length + " words, the longest is with " + maxLength + " symbols.");
		sc.close();
	}

}
