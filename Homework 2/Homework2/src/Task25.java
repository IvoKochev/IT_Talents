import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		int number, counter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		number = sc.nextInt();
		counter = number;
		do{
			counter--;
			number *= counter;
		} while(counter>1);
		System.out.println(number);
		sc.close();

	}

}
