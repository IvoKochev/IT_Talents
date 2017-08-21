import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = sc.nextInt();
		int counter = 0;
		int multiplier = 1;
		int result = 0;
		int residue = 0;
		if(number<0){
			System.out.println("Enter a positive number!");
		} else{
		while(number>0){
			residue = number%2;
			number /= 2;
			result = result + residue*multiplier;
			multiplier *= 10;
			counter++;
		}
		int devisor = multiplier/10;
		if(counter>0){
			int[] array = new int[counter];
			for(int i = 0; i < array.length; i ++){
				array[i] = result/devisor;
				result = result%devisor;
				devisor /= 10;
			}
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + (i == array.length - 1 ? "" : ","));
			}
		}

	}
		sc.close();
	}
	

}
