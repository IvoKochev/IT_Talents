import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the character that you are searching for: ");
		char ch = sc.next().charAt(0);
		System.out.println(str.lastIndexOf(ch));
		sc.close();
	}

}
