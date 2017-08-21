import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter both names with comma between them: ");
		str = sc.nextLine();
		String[] names = str.split(", ");
		//collectible for both sums
		int collectible;
		//sum of the first name
		int sum = 0;
		//sum of the second name
		int sum1 = 0;
		for(int i = 0; i < names[0].length(); i++){
			collectible = (int) names[0].charAt(i);
			sum += collectible;
			
		}
		for(int i = 0; i < names[1].length(); i++){
			collectible = (int) names[1].charAt(i);
			sum1 += collectible;
			
		}
		if(sum1 > sum) {
			System.out.println("The name with bigger sum of ASCII codes is: " + names[1]);
		} else if(sum > sum1) {
			System.out.println("The name with bigger sum of ASCII codes is: " + names[0]);
		} else{
			System.out.println("Both names have the same sum of ASCII table!");
		}
		sc.close();
	}
}
