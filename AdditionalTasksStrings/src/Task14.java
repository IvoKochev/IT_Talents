import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		System.out.print("'" + ch + "' found at index: ");
		for(int i = 0; i < str.length(); i++) { 
			if(str.charAt(i) == ch) {
				System.out.print(i + ",");
			}
		}
		sc.close();

	}

}
