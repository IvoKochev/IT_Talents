import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the character that you want to remove: ");
		char ch = sc.next().charAt(0);
		int index = str.lastIndexOf(ch);
		if(index > -1) {
			String copyStr = "";
			for(int i = 0; i < str.length(); i++) {
				if(i == index) {
					continue;
				} else {
					copyStr += str.charAt(i);
				}
			}
			System.out.println(copyStr);
		} else {
			System.out.println("There is no such character!");
		}
		sc.close();

	}

}
