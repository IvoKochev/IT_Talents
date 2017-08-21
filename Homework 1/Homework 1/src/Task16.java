import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		int number, first, second, third;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number [100-999]");
		number = sc.nextInt();
		if(number < 100 || number > 999){
			System.out.println("Wrong number!");
		} else{
			first = number/100;
			second = number%100;
			second = second/10;
			third = number%10;
			if(first == second && third == second){
				System.out.println("Numbers are equal");
			} else if(first > second && second> third){
				System.out.println("Ascending order");
			} else if(first < second && second < third){
				System.out.println("Descending order");
			} else{
				System.out.println("Numbers are not in order for the upper cases");
			}
		}
		sc.close();
	}

}
