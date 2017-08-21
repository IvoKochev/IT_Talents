import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		int number, tempNumber, sum = 0, reverse;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number [10-30000]: ");
		number = sc.nextInt();
		if(number>= 10 && number <= 30000){
		tempNumber = number;
		do{
			reverse = number % 10;
			sum = sum*10 + reverse;
			number /= 10;
		} while(number > 0);
		if(tempNumber == sum){
			System.out.println("Your number is a palindrome!");
		} else{
			System.out.println("Your number is not a palindrome!");
		}
		} else{
			System.out.println("Invalid number!");
		}
		sc.close();
	
		

	}

}
