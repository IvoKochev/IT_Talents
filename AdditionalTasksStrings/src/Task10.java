import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		String str1 = "";
		for (int i = str.length()-1; i >= 0; i--) {
			str1 += str.charAt(i);
		}
		System.out.println("The reversed string is: " + str1);
		sc.close();

	}

}
