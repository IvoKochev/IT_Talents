import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		char ch = sc.next().charAt(0);
		int counter = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				counter++;
			}
		}
		System.out.println("Total occurences of '" + ch + "': " + counter);
		sc.close();

	}

}
