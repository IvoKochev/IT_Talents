import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n = sc.nextInt();
		if(n < 1){
			System.out.println("Invalid number of elements!");
		} else{
			int counter = 0;
			int counter2 = n-1;
			int[] array = new int[n];
			int tempNumber;
			for(int i = 0; i < n; i++){
				System.out.println("Please enter the " + (i+1) + " element: ");
				array[i] = sc.nextInt();
			}
			for(int i = 0; i < n/2; i++){
				tempNumber = array[i];
				if(tempNumber == array[counter2]){
					counter2--;
					counter++;
				}
			}
			if(n == 1){
				System.out.println("The array is mirror!");
			} else if(counter == n/2){
				System.out.println("The array is mirror!");
			} else{
				System.out.println("The arrey is not mirror!");
			}
			sc.close();
			
		}

	}

}
