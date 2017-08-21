import java.util.Scanner;

public class Task5 {

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
			System.out.println("Enter the value of the element, that you want to remove: ");
			int element = sc.nextInt();
			boolean isThere = false;
			int index = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == element) {
					isThere = true;
					index = i;
					break;
				}
			}
			if (isThere) {
				int[] array1 = new int[array.length - 1];
				int counter = 0;
				for (int i = 0; i < array.length; i++) {
					if (i == index) {
						continue;
					} else {
						array1[counter] = array[i];
						counter++;
					}
				}
				System.out.println("The value of old array: ");
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + (i == array.length - 1 ? "" : ","));
				}
				System.out.println();
				System.out.println("Tha value of new array: ");
				for (int i = 0; i < array1.length; i++) {
					System.out.print(array1[i] + (i == array1.length - 1 ? "" : ","));
				}
			} else {
				System.out.println("The array doesn't contain the value of your element!");
			}

		}
		sc.close();
	}
}
