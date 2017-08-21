import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the length of the array: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n<1) {
			System.out.println("Invalid length of the array!");
		} else {
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter the " + i + " element of the array: ");
				array[i] = sc.nextInt();
			}
			int max = array[0];
			// secondMaax = array[0]-1 because if the first element is the max element
			//they will be equal
			int secondMax = array[0] - 1;
			for (int i = 0; i < array.length; i++) {
				if(array[i] > max){
					max = array[i];
				}
			}
			for (int i = 0; i < array.length; i++) {
				if(array[i]> secondMax && array[i] < max ) {
					secondMax = array[i];
				}
			}
			System.out.println("The second max element of the array is: " + secondMax);
		}
		sc.close();

	}

}
