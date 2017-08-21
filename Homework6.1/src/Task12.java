import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n = sc.nextInt();
		if (n < 1) {
			System.out.println("Invalid number of elements!");
		} else {
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter the [" + i + "] element: ");
				array[i] = sc.nextInt();
			}
			int numberOfNulls = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == 0) {
					numberOfNulls++;

				}
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] == array[j] && array[i] != 0) {
						array[j] = 0;
					}
				}
			}
			int count = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] != 0) {
					count++;
				}
			}
			if (numberOfNulls > 0) {
				int[] noDuplicateArr = new int[count + 1];
				int index = 0;
				noDuplicateArr[index] = 0;
				index++;
				for (int i = 0; i < array.length; i++) {
					if (array[i] != 0) {
						noDuplicateArr[index] = array[i];
						index++;
					}
				}
				System.out.println("The array with no duplicates: ");
				for (int i = 0; i < noDuplicateArr.length; i++) {
					System.out.print(noDuplicateArr[i] + (i == noDuplicateArr.length-1? "" : ","));
				}
			} else {
				int[] noDuplicateArr = new int[count];
				int index = 0;
				for (int i = 0; i < array.length; i++) {
					if (array[i] != 0) {
						noDuplicateArr[index] = array[i];
						index++;
					}
				}
				System.out.println("The array with no duplicates: ");
				for (int i = 0; i < noDuplicateArr.length; i++) {
					System.out.print(noDuplicateArr[i] + (i == noDuplicateArr.length-1? "" : ","));
				}
			}


			sc.close();

		}
	}
}
