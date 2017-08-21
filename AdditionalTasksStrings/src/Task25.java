import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the character that you want to replace: ");
		char ch = sc.next().charAt(0);
		System.out.println("Enter the character that you want to put in");
		char ch1 = sc.next().charAt(0);
		String copyStr = "";
		System.out.println(replaceChar(str, copyStr, ch, ch1));
		sc.close();

	}
	static String replaceChar(String str, String str1, char ch, char ch1) {
		//ch - char to replace
		//ch1 - char to replace with
		int index = str.indexOf(ch);
		String helpString = "";
		int counter = 0;
		if(index > 0) {
			int helpIndex = index;
			for(int i = 0; i < str.length(); i++) {
				if(i == helpIndex) {
					str1 += ch1;
					counter ++;
					} else {
						str1 += str.charAt(i);	
					}
				if(counter > 0) {
					helpString = str.substring(i + 1, str.length()-1);
					helpIndex = helpString.indexOf(ch) + i + 1;
					counter = 0;
				}
			}
			return str1;
			
		} else {
			return "";
		}
	}

}
