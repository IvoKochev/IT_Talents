import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
			String str;
			String str1;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first string: ");
			str = sc.nextLine();
			System.out.println("Enter the second string: ");
			str1 = sc.nextLine();
			if(str.length() > 40 || str1.length() > 40) {
				System.out.println("Invalid length of the strings!");
			} else {
				System.out.println(str.toUpperCase() + " " + str.toLowerCase() + " " + str1.toUpperCase() + " " + str1.toLowerCase());
			}
			sc.close();

	}

}
