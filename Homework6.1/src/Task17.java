import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of elements: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n<1) {
			System.out.println("Invalid number of elements! ");
			
		} else {
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter the [" + i + "] element: ");
				array[i] = sc.nextInt();
			}
			boolean isUnique = true;
			for(int i = 0; i < array.length; i++) {
				for(int j = 0; j < array.length; j++) {
					if(i!=j && array[i] == array[j]) {
						isUnique = false;
					}
				}
				if(isUnique) {
					System.out.println(array[i] + " is unique!");
				}
				isUnique = true;
			}

	}
		sc.close();

}
}
