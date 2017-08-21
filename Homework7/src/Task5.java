import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		String str;
		String str1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first word: ");
		str = sc.next();
		System.out.println("Enter the second word: ");
		str1 = sc.next();
		//checks if there is a letter that matches
		boolean isEqual = false;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == str1.charAt(0)) {
				isEqual = true;
				break;
			}
		}
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == str1.charAt(0) && isEqual) {
					System.out.println(str1);
			} else if(isEqual){
				System.out.println(str.charAt(i));
			}
		}
		if(!isEqual) {
			System.out.println("Second word doesn't match with the first one!");
		} 
		System.out.println();
		boolean isEqual1 = false;
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == str.charAt(0)) {
				isEqual1 = true;
				break;
			}
		}
		for(int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == str.charAt(0) && isEqual1) {
					System.out.println(str);
			} else if(isEqual1){
				System.out.println(str1.charAt(i));
			}
		}
		if(!isEqual1) {
			System.out.println("First word doesn't match with the second one!");
		}
		sc.close();


	}
}


