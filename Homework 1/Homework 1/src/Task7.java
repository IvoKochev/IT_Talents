import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		int hour;
		double sum;
		boolean isHealthy;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hour: ");
		hour = sc.nextInt();
		System.out.println("Enter sum: ");
		sum = sc.nextDouble();
		System.out.println("Enter true if you are healthy or false if you are not: ");
		isHealthy = sc.nextBoolean();
		if(sum>0){
			System.out.println("I will buy medicaments.");
		} else {
			System.out.println("I will stay at home and drink hot tea.");
		}
		if(isHealthy){
			System.out.println("I will go to the cinema with friends.");
		} else {
			System.out.println("I wont go out.");
		}
		
		if(sum<10){
			System.out.println("I will go out for a cofee.");
		}
		sc.close();
	}

}
