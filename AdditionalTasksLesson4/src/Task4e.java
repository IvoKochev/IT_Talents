import java.util.Scanner;

public class Task4e {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		number = sc.nextInt();
		for(int i = 0; i< number; i++){
			for(int j = 0; j < number; j++){
				if((i > 0 && i < number-1) && (j> 0 && j < number-1)){
					System.out.print(" ");
				} else{
					System.out.print("#");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
