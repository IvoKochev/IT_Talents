import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		int number, sum = 0, residue;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		number = sc.nextInt();
		while(number > 0){
			residue = number%2;
			sum = sum + residue;
			number /= 2;
		}
		System.out.println(sum);
		sc.close();

	}

}
