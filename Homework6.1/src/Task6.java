import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of elements: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("Invalid number of elements! ");

		} else {

			int[] array = new int[n];
			int[] copyArr = new int[n];
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter the [" + i + "] element: ");
				array[i] = sc.nextInt();
			}
			for (int i = 0; i < array.length; i++) {
				copyArr[i] = array[i];
			}
			System.out.println("The value of the array: ");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + (i == array.length - 1 ? "" : ","));
			}
			System.out.println();
			System.out.println("The value of the coppied array: ");
			for (int i = 0; i < copyArr.length; i++) {
				System.out.print(copyArr[i] + (i == array.length - 1 ? "" : ","));
			}

		}
		sc.close();
	}
}