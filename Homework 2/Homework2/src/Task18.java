import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		int firstNumber, secondNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number [1-9]: ");
		firstNumber = sc.nextInt();
		System.out.println("Enter second number [1-9]: ");
		secondNumber = sc.nextInt();
		if(firstNumber > 0 && firstNumber<10 && secondNumber>0 && secondNumber <10){
		for(int i = 1; i<=firstNumber; i++){
			for(int j = 1; j<secondNumber; j++){
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
		} else{
			System.out.println("Your numbers are invalid!");
		}
		sc.close();

	}

}
