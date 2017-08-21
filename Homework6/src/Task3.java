import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of the array: ");
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("Invalid number of elements!");
		} else {
			char[] arr = new char[n];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the [" + i + "] element: ");
				arr[i] = sc.next().charAt(0);
			}
			System.out.println("Enter the symbol, that you are searching for: ");
			char ch = sc.next().charAt(0);
			boolean isChar = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == ch) {
					System.out.println("The index of " + ch + ": " + i);
					isChar = true;
					break;
				}

			}
			if (!isChar) {
				System.out.println("There is no such symbol!");
			}
		}
		sc.close();

	}
}
