import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the length of the array: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("Invalid length of the array!");
		} else {
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter the " + i + " element of the array: ");
				array[i] = sc.nextInt();
			}
			int number;
			boolean isThere = true;
			System.out.println("Enter the value of the specific number: ");
			number = sc.nextInt();
			for (int i = 1; i < array.length; i++) {
				if((array[i-1] + array[i]) == number) {
					System.out.println("element[" + (i-1) + "] + element[" + i + "] = " + number);
					isThere = false;
				}
			}
			if(isThere) {
				System.out.println("There is no pair of elements which sum equals your number!");
			}
			

	}
		sc.close();

}
}
