import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int words = 1;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				words++;
			}
		}
		System.out.println("Total number of words: " + words);
		sc.close();

	}

}
