import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		String str;
		String str1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first word with no intervals: ");
		str = sc.next();
		System.out.println("Enter the second word with no intervals: ");
		str1 = sc.next();
		//checks if strings are equal
		boolean isEqual = true;
		if(str.length() == str1.length()) {
			System.out.println("Arrays have the same length!");
			System.out.println("Difference between characters: ");
			for(int i = 0; i < str1.length(); i++) {
				if(!(str.charAt(i) == str1.charAt(i))) {
					isEqual = false;
					System.out.println(i + " " + str.charAt(i) + "-" + str1.charAt(i));
				}
				
			}
			if(isEqual) {
				System.out.println("There are no diferences!");
			}
		} else if(str.length() < str1.length()){
			System.out.println("Array2 has bigger length.");
			System.out.println("Difference between characters: ");
			for(int i = 0; i < str.length(); i++) {
				if(!(str.charAt(i) == str1.charAt(i))) {
					isEqual = false;
					System.out.println(i + " " + str.charAt(i) + "-" + str1.charAt(i));
				}
				
			}
			if(isEqual) {
				System.out.println("There are no diferences!");
			}
		} else{
			System.out.println("String1 has bigger length.");
			System.out.println("Difference between characters: ");
			for(int i = 0; i < str1.length(); i++) {
				
				if(!(str.charAt(i) == str1.charAt(i))) {
					isEqual = false;
					System.out.println(i + " " + str.charAt(i) + "-" + str1.charAt(i));
				}
				
			}
			if(isEqual) {
				System.out.println("There are no diferences!");
			}
		}
		sc.close();

	}

}
