import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		int number, counter = 0, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		number = sc.nextInt();
		do{
			counter++;
			sum += counter;
		} while(counter < number);
		System.out.println("The sum is: " + sum);
		sc.close();

	}

}
