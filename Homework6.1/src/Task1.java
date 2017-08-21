import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of elements: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("Invalid number of elements! ");

		} else {
			int sum = 0;
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter the [" + i + "] element: ");
				array[i] = sc.nextInt();
				sum += array[i];
			}
			System.out.println("The sum of all elements is: " + sum);
		}
		sc.close();

	}

}
