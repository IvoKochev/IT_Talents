import java.util.Scanner;

public class Task21 {

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
			// counts the even elements
			int even = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] % 2 == 0) {
					even++;
				}
			}
			// index for evenNumbers[]
			int index = 0;
			// index for oddNumbers[]
			int index1 = 0;
			int[] evenNumbers = new int[even];
			int[] oddNumbers = new int[array.length - even];
			for (int i = 0; i < array.length; i++) {
				if (array[i] % 2 == 0) {
					evenNumbers[index] = array[i];
					index++;
				} else {
					oddNumbers[index1] = array[i];
					index1++;
				}
			}
			System.out.println("Even elements: ");
			for (int i = 0; i < evenNumbers.length; i++) {
				System.out.print(evenNumbers[i] + (i == evenNumbers.length - 1 ? "" : ","));
			}
			System.out.println();
			System.out.println("Odd elements: ");
			for (int i = 0; i < oddNumbers.length; i++) {
				System.out.print(oddNumbers[i] + (i == oddNumbers.length - 1 ? "" : ","));
			}

		}
		sc.close();

	}

}
