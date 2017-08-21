import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of elements: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("Invalid number of elements! ");

		} else {
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter the [" + i + "] element: ");
				array[i] = sc.nextInt();
			}
			int counter = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] < 0) {
					counter++;
				}
			}
			if (counter > 0) {
				System.out.println("Total number of negative elemets are:" + counter);
			} else{
				System.out.println("All elements are positive!");
			}
		}
		sc.close();

	}
}
