import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		int number, counter = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		number = sc.nextInt();
		if (number > 0) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					counter++;
				}
			}
			if(counter>0){
				System.out.println("Not a simple number");
			} else {
				System.out.println("Simple number");
			}

		} else if(number<0){
			for (int i = -2; i > number; i--) {
				if (number % i == 0) {
					counter++;
				}
			}
			if(counter>0){
				System.out.println("Not a simple number");
			} else {
				System.out.println("Simple number");
			}
			
		}
		sc.close();
	} 
}
