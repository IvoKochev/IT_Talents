import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your number: ");
		number = sc.nextInt();
		int[] array = new int[10];
		for(int i = 0; i< 10; i ++){
			if(i == 0 || i == 1){
				array[i] = number;
			} else{
				array[i] = array[i-2] + array[i-1]; // when we get to the 3rd element it gets the value of the sum of the previous 2 elements
			}
		}
		for(int i = 0; i < 10; i++){
			System.out.println("The " + (i +1) + " element is: " + array[i]);
		}
		sc.close();

	}

}
