import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		String copyStr = str.substring(0, 1);
		boolean isThere = false;
		for(int i = 1; i < str.length(); i++) {
			for(int j = 0; j < copyStr.length(); j++) {
				if(str.charAt(i) == copyStr.charAt(j) && str.charAt(i) != ' ') {
					isThere = true;
				}
			}
			if(!isThere) {
				copyStr += str.charAt(i);
			}
			isThere = false;
			}
		System.out.println(copyStr);
		sc.close();

	}

}
