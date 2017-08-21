import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		int number, firstFour, secondThird, firstNumber, thirdNumber, fourthNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number [1000-9999]");
		number = sc.nextInt();
		firstNumber = number/1000;
		fourthNumber = number%10;
		firstFour = firstNumber*10 + fourthNumber;
		thirdNumber = number%1000;
		secondThird = thirdNumber/10;
		if(firstFour>secondThird){
			System.out.println("The first number is bigger than the second.");
		} else if(firstFour==secondThird){
			System.out.println("The numbers are equal.");
		} else{
			System.out.println("The second number is bigger than the first.");
		}
		sc.close();

	}

}
