import java.util.Scanner;

public class Task14 {

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
			int min = array[0];
			//secondMin = array[0] + 1 because if the first element is the smallest
			//they will be equal
			int secondMin = array[0] + 1;
			for (int i = 0; i < array.length; i++) {
				if (array[i] < min) {
					min = array[i];
				}
			}
			for (int i = 0; i < array.length; i++) {
				if (array[i] < secondMin && array[i] > min) {
					secondMin = array[i];
				}
			}
			System.out.println("The second smallest element of the array is: " + secondMin);

		}
		sc.close();

	}
}
