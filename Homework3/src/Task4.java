import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		int number;
		boolean isPrime = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		number = sc.nextInt();
		for(int i = 2; i< number; i++ ){
			if(number % i == 0){
				isPrime = true;
				break;
			}
		}
		if(isPrime){
			System.out.println("Your number is not prime!");
		} else {
			System.out.println("Your number is prime!");
		}
		sc.close();
	}

}
