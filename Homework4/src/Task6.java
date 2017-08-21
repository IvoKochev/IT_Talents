import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		int n, n1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements for the first array: ");
		n = sc.nextInt();
		System.out.println("Enter the number of elements for the second array: ");
		n1 = sc.nextInt();
		if(n > 0 && n1 > 0){
			int counter = 0; // will check if arrays are equals
		int[] array = new int[n];
		int[] array1 = new int[n1];
		for(int i = 0; i < n; i++){
			System.out.println("Please enter the " + (i+1) + " element of the first array: ");
			array[i] = sc.nextInt();
		}
		for(int i = 0; i < n1; i++){
			System.out.println("Please enter the " + (i+1) + " element of the second array: ");
			array1[i] = sc.nextInt();
		}
		if(array.length == array1.length){
			for(int i = 0; i < array.length; i ++){
				if(array[i] != array1[i]){
					counter++;
				}
			}
			if(counter == 0){
				System.out.println("The arrays have the same length and are equals!");
			} else{
				System.out.println("The arrays have the same length but are not equals!");
			}
		} else{
			System.out.println("The arrays have different length and are not equals!");
		}
		}
		sc.close();
		
		

	}

}
