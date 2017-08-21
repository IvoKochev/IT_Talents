import java.util.Scanner;

public class Task19 {

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
			int even = 0;
			int odd = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}
			System.out.println("Total even elements: " + even + "\nTotal odd elements: " + odd);
		}
		sc.close();

	}
}
