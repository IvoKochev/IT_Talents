import java.util.Scanner;

public class Task7 {

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
			System.out.println("Enter the value of the element, that you want to insert: ");
			int element = sc.nextInt();
			System.out.println("Enter the index of the inserted element: ");
			int index = sc.nextInt();
			if (index < 0 || index > array.length - 1) {
				System.out.println("Invalid index! ");
			} else {
				int[] array1 = new int[array.length + 1];
				//use counter as iterator for the old array
				int counter = 0;
				for (int i = 0; i < array1.length; i++) {
					if (i == index) {
						array1[i] = element;
					} else {
						array1[i] = array[counter];
						counter++;
					}
				}
				System.out.println("The value of old array: ");
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + (i == array.length - 1 ? "" : ","));
				}
				System.out.println();
				System.out.println("The value of the new array: ");
				for (int i = 0; i < array1.length; i++) {
					System.out.print(array1[i] + (i == array1.length - 1 ? "" : ","));
				}
			}
		}
		sc.close();

	}
}
