import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		int length = str.lastIndexOf("");
		System.out.println("The length of " + str + " is " + length);
		sc.close();

	}

}
