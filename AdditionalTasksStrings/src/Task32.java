import java.util.Scanner;

public class Task32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		String copyStr = "";
		int counter = 0;
		int helpCounter = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				counter++;
			}
		}
		for(int i = 0; i < str.length() - 2; i++) {
			if(str.charAt(i) == ' ' && str.charAt(i+1) == ' ') {
				continue;
			} else if(str.charAt(i) != ' ' && str.charAt(i+1) != ' ' && helpCounter == counter) {
				helpCounter++;
				continue;
			}else{
				copyStr += str.charAt(i);
			}
		}
		System.out.println(copyStr);
		sc.close();

	}

}
