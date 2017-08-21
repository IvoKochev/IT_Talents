import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		String copyStr = " ";
		boolean isThere = false;
		int counter = 1;
		for (int i = 0; i < str.length(); i++) {
			for(int j = i+1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					counter++;
				}
			}
			for(int k = 0; k < copyStr.length(); k++) {
				if(copyStr.charAt(k) == str.charAt(i)) {
					isThere = true;
				}
			}
			if(!isThere) {
			copyStr += str.charAt(i);
			System.out.println(str.charAt(i) + " = " + counter);
			}
			isThere = false;
			counter = 1;
		}
		sc.close();
		

	}

}
