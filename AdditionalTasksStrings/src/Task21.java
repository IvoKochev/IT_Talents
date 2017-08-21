import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the character that you want to remove: ");
		char ch = sc.next().charAt(0);
		String copyStr = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				continue;
			} else {
				copyStr += str.charAt(i);
			}
		}
		System.out.println(copyStr);
		sc.close();

	}

}
