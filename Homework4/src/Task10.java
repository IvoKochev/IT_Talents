import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		int[] array = new int[7];
		double sum = 0;
		int tempNumber; // holds the temporary nearest number
		Scanner sc = new Scanner(System.in);
		for(int i =0; i < array.length; i++){
			System.out.println("Enter the " + i + " element: ");
			array[i] = sc.nextInt();
			sum+= array[i];
		}
		sum/=7;
		tempNumber = array[0];
		for(int i = 0; i< array.length; i++){
			if((array[i] <= tempNumber && array[i]>= sum) || (array[i] >= tempNumber && array[i] <= sum)){
				tempNumber = array[i];
			}
		}
		System.out.println(tempNumber);
		sc.close();

	}
	

}
