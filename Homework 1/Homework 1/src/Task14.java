import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		int x1, x2, y1, y2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1: ");
		x1 = sc.nextInt();
		System.out.println("Enter y1: ");
		y1 = sc.nextInt();
		System.out.println("Enter x2: ");
		x2 = sc.nextInt();
		System.out.println("Enter y2: ");
		y2 = sc.nextInt();
		if(((x1+y1) %2 == 0) && ((x2+y2) %2 == 0) || ((x1+y1) %2 != 0) && ((x2+y2) %2 != 0)){
			System.out.println("Positions are with the same color");
		} else{
			System.out.println("Positions are with different colors");
		}
		sc.close();
	}

}
