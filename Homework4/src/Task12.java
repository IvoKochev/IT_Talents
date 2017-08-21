import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		double[] array = new double[7]; // double because you cant devide 7 by 3 for example
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + i + " element: ");
			array[i] = sc.nextDouble();
			if((i==4 || i ==5) && array[i] == 0){
				System.out.println("Invalid element!"); // if you devide by 0 you loose one of the elements
				break;
			}
		}
		double tempNumber;
		tempNumber = array[1];
		array[1] = array[0];
		array[0] = tempNumber;
		array[2] = array[2] + array[3];
		array[3] = array[2] - array[3];
		array[2] = array[2] - array[3];
		array[4] = array[4]*array[5];
		array[5] = array[4]/array[5];
		array[4] = array[4] / array[5];
		for(int i = 0; i < array.length; i ++){
			System.out.print(array[i] + (i == array.length - 1 ? "" : ","));
		}
		sc.close();

	}

}
