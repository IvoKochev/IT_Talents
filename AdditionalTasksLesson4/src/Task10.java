import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		int number, tempNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		number = sc.nextInt();
		for(int i = 1; i <=number; i++){
			tempNumber = i;
			for(int j = 1; j < number*2 + 1; j++){
				System.out.print(tempNumber + " ");
				tempNumber += i;
			}
			System.out.println();
		}
		sc.close();

	}

}
