import java.util.Scanner;

public class Task4c {

	public static void main(String[] args) {
		int number, spaceNumber = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		number = sc.nextInt();
		for(int i = 0; i < number; i++){
			for(int s = 0; s < spaceNumber; s++){
				System.out.print(" ");
			}
			for(int j = number; j > spaceNumber; j--){
				System.out.print("#");
			}
			spaceNumber++;
			System.out.println();
		}
		sc.close();

	}

}
