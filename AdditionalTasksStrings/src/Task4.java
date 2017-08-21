import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		String str1 = "";
		for(int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			int ascii = (int) a;
			ascii = ascii - 32;
			a = (char) ascii;
			str1 =str1+ a;
		}
		System.out.println(str1);
		sc.close();

	}

}
