import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		n = sc.nextInt();
		if(isSimple(n, n-1)) {
			System.out.println("prosto");
		} else{
			System.out.println("slojno");
		}
		sc.close();
	}
	static boolean isSimple(int n, int devisor) {
		if(devisor == 1) {
			return true;
		} else if(n % devisor == 0) {
			return false;
		} else{
			return isSimple(n, devisor - 1);
		}
		
		
	}
}

