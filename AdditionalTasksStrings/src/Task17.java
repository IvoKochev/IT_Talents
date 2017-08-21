import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int counter = 0;
		int minCounter = 5000000;
		char ch;
		char minChar = str.charAt(0);
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			for(int j = 0; j < str.length(); j++) {
				if(ch == str.charAt(j)) {
					counter++;
				}
			}
			if(counter < minCounter) {
				minCounter = counter;
				minChar = str.charAt(i);
			}
			counter = 0;
		}
		System.out.println("Lowest frequency: '" + minChar + "' = " + minCounter);
		sc.close();
			
	}

}
