import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		int n, n1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of the first array: ");
		n = sc.nextInt();
		System.out.println("Enter the number of elements of the second array: ");
		n1 = sc.nextInt();
		if(n<1 || n1 < 1 || n!=n1) {
			System.out.println("Invalid number of elements!");
		} else {
			int[] array = new int[n];
			int[] array1 = new int[n1];
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter the [" + i +"] element of the first array: ");
				array[i] = sc.nextInt();
			}
			for (int i = 0; i < array1.length; i++) {
				System.out.println("Enter the [" + i +"] element of the second array: ");
				array1[i] = sc.nextInt();
			}
			boolean isEqual = true;
			for(int i = 0; i < array.length; i++) {
				if(array[i] != array1[i]) {
					isEqual = false;
					System.out.println("The arrays are not equal!");
					break;
				}
			}
			if(isEqual) {
				System.out.println("The arrays are equal!");
			}
		}
		sc.close();

	}

}
