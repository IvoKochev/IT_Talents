import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n = sc.nextInt();
		if(n<1){
			System.out.println("Invalid number of elements! ");
		} else{
			int[] array1 = new int[n];
			int[] array2 = new int[n];
			int[] biggestArray = new int[n];
			for (int i = 0; i < array1.length; i++) {
				System.out.println("Enter the " + i + " element of the first array: ");
				array1[i] = sc.nextInt();
			}
			for (int i = 0; i < array2.length; i++) {
				System.out.println("Enter the " + i + " element of the second array: ");
				array2[i] = sc.nextInt();
			}
			for (int i = 0; i < biggestArray.length; i++) {
				if(array1[i] >=array2[i]){
					biggestArray[i] = array1[i];
				} else {
					biggestArray[i] = array2[i];
				}
			}
			for (int i = 0; i < array1.length; i++) {
				System.out.print(array1[i] + (i == array1.length-1 ? "" : ","));
			}
			System.out.println();
			for (int i = 0; i < array2.length; i++) {
				System.out.print(array2[i] + (i == array2.length-1 ? "" : ","));
			}
			System.out.println();
			for (int i = 0; i < biggestArray.length; i++) {
				System.out.print(biggestArray[i] + (i == biggestArray.length-1 ? "" : ","));
			}
		}
		sc.close();

	}

}
