import java.util.Scanner;

public class Task4f {

	public static void main(String[] args) {
		int number, counter = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		number = sc.nextInt();
		for(int i = 0; i < number; i++){
			for(int j = 0; j < number; j++){
				if(i==0 || i == number-1){
					System.out.print("#");
				} else if(j != counter){
					System.out.print(" ");
				} else if(j == counter){
					System.out.print("#");
				}
				
			}
			counter++;
			System.out.println();
		}
		sc.close();

	}

}
