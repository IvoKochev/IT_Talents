import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		int firstNumber, secondNumber, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		firstNumber = sc.nextInt();
		System.out.println("Enter the second number: ");
		secondNumber = sc.nextInt();
		for(int i = firstNumber; i<=secondNumber; i++){
			if(i%3==0){
				System.out.print("skip " + i + ",");
			} else if(sum<200){
				System.out.print((i*i) + ",");
				sum += i*i;
			} else{
				System.out.println("\n The sum is higher than 200 => " + sum);
				break;
			}
		}

	}

}