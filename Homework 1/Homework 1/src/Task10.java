import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		int liters, residue, count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter litters [10-9999]: ");
		liters = sc.nextInt();
		count = liters/5;
		residue = liters%5;
		if(residue == 0){
			System.out.println(count + " times x 3 liters and " + count + " times x 2 liters");
		}
		if(residue == 1){
			System.out.println((count-1)  + " times x 3 liters and " + (count+1) + " times x 2 liters");
		}
		if(residue == 2){
			System.out.println(count + " times x 3 liters and " + (count+1) + " times x 2 liters");
		}
		if(residue == 3){
			System.out.println((count+1) + " times x 3 liters and " + count + " times x 2 liters");
		}
		if(residue == 4){
			System.out.println(count + " times x 3 liters and " + (count+2) + " times x 2 liters");
		}
		sc.close();
		
	}
}
