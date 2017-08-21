import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n = sc.nextInt();
		// holds the current biggest number
		double tempNumber; 
		// holds the absolute value if the element<0
		double tempNumber2; 
		int counter=0;
		if(n<3){
			System.out.println("Invalid number of elements!");
			
		} else{
			double[] array = new double[n];
			// put the three elements here so i can syso them in asc order
			double [] helpArr = new double[3]; 
			for(int i = 0; i < array.length; i++){
				System.out.println("Enter " + i + " element: ");
				array[i] = sc.nextDouble();
			}
			// tempNumber gets the value of the first element
			//so i can compare it with the other elements
			tempNumber = array[0]; 
			// i-- because i want to syso the elements in asc order
			for(int i = 2; i>=0; i --){
				for(int j = 0; j < array.length; j++){
					if(array[j]<0){
						// if the element<0 i get its absolute value
						tempNumber2 = array[j]*(-1); 
						if(tempNumber2 > tempNumber){
							tempNumber = tempNumber2;
							counter = j;
						}
						
					} else{
						if(array[j] > tempNumber){
							tempNumber = array[j];
							counter = j;
						}
					}
				}
				helpArr[i] = tempNumber;
				// make the highest element 0 so i know there is a bigger
				// element now if there arent only 0s
				array[counter] = 0;
				tempNumber = 0;
			}
			for(int i = 0; i < helpArr.length; i++){
				System.out.print(helpArr[i] + (i == helpArr.length-1 ? "" : ";"));
			}
			
		}
		sc.close();

	}

}
