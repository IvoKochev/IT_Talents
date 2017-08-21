import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of the elements of the array: ");
		n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Invalid number of elements! ");
		} else {
			int[] array = new int[n];
			int tempNumber = 0; // holds the elements those can be devided by 3
			int counter = 0;
			for (int i = 0; i < n; i++) {
				System.out.println("Please enter the value of " + (i+1) + " element: ");
				array[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {

				if (array[i] % 3 == 0 && array[i] != 0) {
					tempNumber = array[i];
					counter++; // counts if there is any element that can be devided by 3
					break;
				}

			}
			if(counter != 0 ){ // if there is at least 1 element that can be devided by 3
			for (int i = 0; i < n; i++) {
				
					if (array[i] != 0 && array[i] % 3 == 0) {
						if (tempNumber > array[i]) {
							tempNumber = array[i];
						} else {
							continue;
						}
					}
				}
				
			}
			if(tempNumber != 0){
				System.out.println("The smallest element that devides by 3 is: " + tempNumber);
			} else{
				System.out.println("There is no element that can be devided by 3!");
			}
			

		}
		sc.close();

	}

}
