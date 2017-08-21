import java.util.Scanner;

public class Task4i {

	public static void main(String[] args) {
		int number, counter = 0, counter1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		number = sc.nextInt();
		counter1 = number - 1;
		for(int i = 0; i < number; i++){
			for(int j = 0; j < number; j++){
				if(i==0 || i == number-1){
					System.out.print("#");
				} else if((i > 0 && i < number) && (j == 0 || j == number-1)){
					System.out.print("#");
				} else if(j != counter && j != counter1){
					System.out.print(" ");
				} else if(j == counter || j == counter1){
					System.out.print("#");
				}
				
			}
			counter1--;
			counter++;
			System.out.println();
		}
		sc.close();

	}

}
