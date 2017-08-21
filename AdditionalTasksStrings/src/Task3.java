import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str = sc.nextLine();
		System.out.println("Enter the second string: ");
		String str1 = sc.nextLine();
		if(str.length() == str1.length()) {
			boolean isEqual = true;
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) != str1.charAt(i)) {
					isEqual = false;
					break;
				}
			}
			if(isEqual) {
				System.out.println("Both strings are equal!");
			} else {
				System.out.println("Strings are not equal!");
			}
		} else {
			System.out.println("Invalid length of the strings!");
		}
		sc.close();

	}

}
