import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int firstNumber, secondNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		firstNumber = sc.nextInt();
		System.out.println("Enter the second number: ");
		secondNumber = sc.nextInt();
		if(firstNumber > secondNumber){
			for(int i = secondNumber; i < firstNumber; i++){
				if(i%3 == 0){
					System.out.println(i);
				}
			}
		} else if (secondNumber > firstNumber){
			for(int i = firstNumber; i < secondNumber; i++){
				if (i%3 == 0){
					System.out.println(i);
				}
			}
		} else{
			System.out.println("Your numbers are equal!");
		}
		sc.close();

	}

}
