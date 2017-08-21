import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		int[] array = new int[7];
		//this second array is only about the last comma
		int[] helpArr = new int[7]; 
		//counts elements those are bigger than 5 and can be devided by 5
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < array.length; i++){
			System.out.println("Enter the " + i + " element: ");
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if(array[i] > 5 && array[i] % 5 == 0){
				helpArr[counter] = array[i];
				counter++;
				
			}
		}
		for(int i = 0; i < counter; i++){
			System.out.print(helpArr[i] + (i == counter-1 ? "" : ","));
		}
		System.out.print(" - " + counter + " numbers");
		sc.close();
		
	}

}
