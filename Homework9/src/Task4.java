import java.util.Scanner;

public class Task4 {

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
			int[] newArray = findPlace(arr, element);
			System.out.println("The new array is: ");
			for (int i = 0; i < newArray.length; i++) {
				System.out.print(newArray[i] + (i == newArray.length-1 ? "" : ","));
			}
		} else {
			System.out.println("Invalid number of elements!");
		}
		sc.close();

	}
	static int[] findPlace(int[] arr, int element) {
		int index = 0;
		int helpIndex = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] <= element && arr[i+1] >= element) {
				index = i+1;
				break;
				}
		}
		int[] newArray = new int[arr.length + 1];
		//if the element is the biggest number of the new array
		if(element >= arr[arr.length-1]) {
			newArray[newArray.length-1] = element;
			for (int i = 0; i < arr.length; i++) {
				newArray[helpIndex] = arr[i];
				helpIndex++;
			}
		}//if the element is the smallest in the new array 
		else if(element <= arr[0]) {
			newArray[0] = element;
			helpIndex++;
			for (int i = 0; i < arr.length; i++) {
				newArray[helpIndex] = arr[i];
				helpIndex++;
			}
		} //if the element is somewhere in the middle 
		else {
			for (int i = 0; i < newArray.length; i++) {
				if(i == index) {
					newArray[i] = element;
				} else {
					newArray[i] = arr[helpIndex];
					helpIndex++;
				}
			}
		}
		
		return newArray;
	}

}
