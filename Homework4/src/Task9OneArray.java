import java.util.Scanner;

public class Task9OneArray {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n  = sc.nextInt();
		if(n < 1){
			System.out.println("Invalid number of elements!");
		} else{
			int[] array = new int[n];
			int tempNumber;
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter the " + i + " element: ");
				array[i] = sc.nextInt();
			}
			for (int i = 0; i < array.length / 2; i++) {
				tempNumber = array[i];	
				array[i] = array[array.length - i - 1];
				array[array.length - i - 1] = tempNumber;	
			}
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + (i == array.length-1 ? "" : ","));
			}
		}
		sc.close();
		

	}

}
