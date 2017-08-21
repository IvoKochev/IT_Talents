import java.util.Scanner;

public class Task23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the character that you want to replace: ");
		char ch = sc.next().charAt(0);
		System.out.println("Enter the character that you want to put in");
		char ch1 = sc.next().charAt(0);
		int index = str.indexOf(ch);
		if(index >= 0) {
		String copyStr = "";
		for(int i = 0; i < str.length(); i++) {
			if(i == index) {
				copyStr += ch1;
			} else {
				copyStr += str.charAt(i);
			}
		}
		System.out.println(copyStr);
		} else {
			System.out.println("There is no such character in the string!");
		}
		sc.close();

	}

}
