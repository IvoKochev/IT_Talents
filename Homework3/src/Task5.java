import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		int multiplier = 1, result = 0, number, residue;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		number = sc.nextInt();
		while(number > 0){
			residue = number % 2;
			number /=2;
			result = result + multiplier * residue;
			multiplier *= 10;
		}
		System.out.println(result);
		sc.close();

	}

}
