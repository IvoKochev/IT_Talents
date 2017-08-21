import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		int temperature;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature: ");
		temperature = sc.nextInt();
		if(temperature < -20){
			System.out.println("It is ice cold outside ! ");
		} else if(temperature >= -20 && temperature <= 0){
			System.out.println("It is cold outside !");
		} else if(temperature > 0 && temperature <= 15){
			System.out.println("It is cool otside.");
		} else if(temperature > 15 && temperature <= 25){
			System.out.println("It is warm outside.");
		} else{
			System.out.println("It is hot outside!");
		}
		sc.close();
	}
}
