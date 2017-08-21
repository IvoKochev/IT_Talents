import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number [10-99]: ");
		number = sc.nextInt();
		if(number>9 && number < 100){
			do{
				if(number%2 == 0){
					number *= 0.5;
					System.out.print(number + ",");
				} else{
					number= number * 3 + 1;
					System.out.print(number + ",");
				}
			} while(number !=1);
		}
		sc.close();
	}

}
