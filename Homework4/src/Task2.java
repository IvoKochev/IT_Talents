import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n = sc.nextInt();
		if(n<1){
			System.out.println("Invalid number of elements!");
		} else{
			int counter = n-1; // i will use it to reverse the array
		int[] array = new int[n];
		for(int i = 0; i< n; i++){
			System.out.println("Please enter the " + (i+1) + " element: ");
			array[i] = sc.nextInt();
		}
		int[] newArray = new int[n*2];
		for(int i = 0; i < n*2; i++){
			if(i < n){
			newArray[i] = array[i];
			} else{
				newArray[i] = array[counter];
				counter--; // getting the reverse elements
			}
		}
		for(int i = 0; i < n*2; i++){
			System.out.println("The " + (i+1) + " element is " + newArray[i]);
		}
		sc.close();
		}

	}

}
