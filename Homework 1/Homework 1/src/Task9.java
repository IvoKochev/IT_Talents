import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number [10-99]: ");
		a = sc.nextInt();
		System.out.println("Enter the second number [10-99]: ");
		b = sc.nextInt();
		c = (a*b)%10;
		if(c==0){
			System.out.println(a*b + ", " + c + " - not even, not odd");
		} else if((c%2)==0){
			System.out.println(a*b + ", " + c + " - even");
		} else{
			System.out.println(a*b + ", " + c + " - odd");
		}
		
		sc.close();
	}

}
