import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.next();
		//holds the value in ascii for each char
		int temp;
		String str1 = "";
		//gets the ascii value incremented by 5
		char a;
		for(int i = 0; i < str.length(); i++) {
			temp = (int) str.charAt(i);
			temp += 5;
			a = (char) temp;
			str1 += a;
		}
		System.out.println(str1);
		sc.close();

	}

}
