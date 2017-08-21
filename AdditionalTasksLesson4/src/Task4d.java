import java.util.Scanner;

public class Task4d {

	public static void main(String[] args) {
		int number, spaceNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		number = sc.nextInt();
		spaceNumber = number - 1;
		for(int i = 0; i< number; i++){
			for(int j = spaceNumber; j> i; j--){
				System.out.print(" ");
			}
			for(int s = 0; s <= i; s++){
				System.out.print("#");
			}
			System.out.println();
		}
		sc.close();

	}

}
