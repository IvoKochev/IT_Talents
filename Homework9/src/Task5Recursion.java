import java.util.Arrays;
import java.util.Scanner;

public class Task5Recursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of the array: ");
		int n = sc.nextInt();
		if(n > 0) {
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the [" + i + "] element: ");
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the element, you want to put in the array: ");
			int element = sc.nextInt();
			int[] newArray = new int[arr.length+1];
			newArray = findPlace(arr, newArray, element, 0, 0);
			
			System.out.println("The new array is: ");
			for (int i = 0; i < newArray.length; i++) {
				System.out.print(newArray[i] + (i == newArray.length-1 ? "" : ","));
			}
		} else {
			System.out.println("Invalid number of elements!");
		}
		sc.close();

	}
	static int[] findPlace(int[] arr, int [] newArray, int element, int arrStart, int newArrStart) {
		if(arrStart > arr.length-1) {
			return newArray;
		} 
		if(element <= arr[0]) {
			newArray[0] = element;
			newArray[arrStart + 1] = arr[arrStart];
			return findPlace(arr, newArray, element, arrStart+1, newArrStart);
		} else if(element > arr[arr.length-1]) {
			newArray[newArray.length-1] = element;
			newArray[arrStart] = arr[arrStart];
			return findPlace(arr, newArray, element, arrStart+1, newArrStart);
		} else if(element >= arr[arrStart] && element <= arr[arrStart+1]) {
			newArray[newArrStart+1] = element;
			newArray[newArrStart] = arr[arrStart];
			newArray[newArrStart+2] = arr[arrStart+1];
			return findPlace(arr, newArray, element, arrStart+2, newArrStart+3);
		} else {
			newArray[newArrStart] = arr[arrStart];
			return findPlace(arr, newArray, element, arrStart+1, newArrStart+1);
		}
		
		
	}

}
