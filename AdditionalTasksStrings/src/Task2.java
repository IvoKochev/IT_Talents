import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str = sc.nextLine();
		System.out.println("Enter the second string: ");
		String str1 = sc.nextLine();
		System.out.println(str.concat(str1));
		sc.close();

	}

}
