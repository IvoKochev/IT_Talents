import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		number = sc.nextInt();
		int counter = 1;
		while (counter<=10){
			if(number % 2 == 0 || number % 3 ==0 || number% 5 == 0){
				System.out.print(counter + ":" + number + ",");
				counter++;
			}
			number++;
		}
		sc.close();
	}

}