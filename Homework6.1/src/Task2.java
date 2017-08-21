import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of elements: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n<1) {
			System.out.println("Invalid number of elements! ");
			
		} else {
			int[] array = new int[n];
			double sum = 0;
			//use avg as average and counter
			double avg = 0;
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter the [" + i + "] element: ");
				array[i] = sc.nextInt();
				sum+= array[i];
				avg++;
			}
			avg = sum / avg;
			System.out.println("The average is: " + avg);
			
		}
		sc.close();

	}

}
