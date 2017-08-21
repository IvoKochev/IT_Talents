import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n = sc.nextInt();
		int counter = n-1; // use it for mirrorArr iterator
		if(n<1){
			System.out.println("Invalid number of elements!");
		} else{
			int[] array = new int[n];
			int[] mirrorArr = new int[n];
			for(int i = 0; i < array.length; i++){
				System.out.println("Enter the " + i + " element of the array: ");
				array[i] = sc.nextInt();
				mirrorArr[counter] = array[i];
				counter--;
			}
			for (int i = array.length - 1; i >= 0; i--) {
				System.out.print(array[i] + (i == 0 ? "" : ","));
			}
			
		}
		sc.close();
		

	}

}
