import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the word: ");
		String word = sc.next();
		String[] words = str.split(" ");
		String copyStr = "";
		int counter = 0;
		for(int i = 0; i < words.length; i++) {
			if(!words[i].equals(word) && counter ==0) {
				copyStr += words[i] + " ";
			} else if(words[i].equals(word) && counter == 0){
				counter++;
				continue;
			} else {
				copyStr += words[i] + " ";
			}
		}
		System.out.println(copyStr.trim());
		sc.close();


	}

}
