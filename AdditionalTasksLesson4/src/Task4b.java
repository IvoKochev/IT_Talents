import java.util.Scanner;

public class Task4b {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		number = sc.nextInt();
		for(int i = number; i>0; i--){
			for(int j = 0; j<i; j++){
				System.out.print("# ");
			}
			System.out.println();
		}
		sc.close();
	}

}
