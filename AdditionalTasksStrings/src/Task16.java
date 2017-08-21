import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		char ch = ' ', maxChar = ' ';
		int counter = 0;
		int maxCounter=0;
		for(int i = 0; i < str.length() - 1; i++) {
			ch = str.charAt(i);
			for(int j = i+1; j< str.length(); j++) {
				if(ch == str.charAt(j)) {
					counter++;
				}
			}
			if(counter > maxCounter) {
				maxCounter = counter;
				maxChar = str.charAt(i);
			}
			counter = 0;
		}
		System.out.println("Maxmimum occuring character : '" + maxChar + "'");
		sc.close();

	}

}
