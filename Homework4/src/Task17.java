import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n = sc.nextInt();
		if(n < 1){
			System.out.println("Invalid number of elements!");
		} else {
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter the " + i + " element: ");
				array[i] = sc.nextInt();
			}
			for(int i = 1; i < array.length - 1; i+=2){
				if((array[i-1] >= array[i]) ||(array[i] <= array[i+1])){
					System.out.println("Doesnt fulfill the requirements for a zigzagged up row");
					break;
				} else{
					if(i == array.length-2 || i == array.length-3){
						System.out.println("Fulfills the requirements for a zigzagged up row");
					}
				}
			}
			
		} sc.close();

	}

}
