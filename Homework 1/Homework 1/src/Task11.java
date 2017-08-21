import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		int number, x1, x2, x3;
		System.out.println("Enter the number [100-999]: ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		x1 = number/100;
		x2 = number%100;
		x2 = x2/10;
		x3 = number %10;
		if(x1 == 0 || x2 == 0 || x3 == 0) {
			System.out.println("Your number contains 0 ");
		} else{
			if(number%x1 == 0){
				System.out.println("You can devide your number by " + x1);
			} else {
				System.out.println("You can't devide your number by " + x1);
			}
			if(number%x2 == 0){
				System.out.println("You can devide your number by " + x2);
			} else{
				System.out.println("You can't devide your number by " + x2);
			}
			if(number%x3 == 0){
				System.out.println("You can devide your number by " + x3);
			} else{
				System.out.println("You can't devide your number by " + x3);
			}
		}
		sc.close();

	}

}
