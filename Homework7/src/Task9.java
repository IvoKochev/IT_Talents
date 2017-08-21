import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.next();
		// holds all the numbers
		String str1 = " ";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				if (i > 0 && str.charAt(i - 1) == '-') {

					// if there is a negative number we add -
					str1 += "-" + str.charAt(i);

				} else {

					str1 = str1 + str.charAt(i);
				}

			} else if (!(str1.substring(str1.length() - 1).equals(" "))) {
				// add " " so i can split it after the loop
				str1 += " ";
			}
		}
		//remove the first interval
		str1 = str1.trim();
		int sum = 0;
		String[] numbers = str1.split(" ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			sum += Integer.parseInt(numbers[i]);
		}
		System.out.println(sum);
		sc.close();

	}
}
