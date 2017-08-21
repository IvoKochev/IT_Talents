import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: [10-200] ");
		number = sc.nextInt();
		for(int i = number; i > 0; i--){
			if(i%7 == 0){
				System.out.print(i + ",");
			}
		}
		sc.close();

	}

}
