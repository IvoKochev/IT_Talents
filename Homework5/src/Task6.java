
public class Task6 {

	public static void main(String[] args) {
		int[][] array = { { 11, 15, 33, 36, 52, 1 }, { 22, 46, 64, 42, 27, 4 }, { 33, 11, 15, 7, 3, 1 },
				{ 20, 46, 28, 62, 2, 6 }, { 1, 3, 5, 7, 8, 5 }, { 22, 44, 66, 64, 42, 26 } };
		//holds the whole sum
		int sum = 0;
		//holds the sum of the temporary row
		int tempSum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i%2 == 1) {
					System.out.print(array[i][j] + (j == array.length - 1 ? " " : ","));
					tempSum += array[i][j];
				}

			}
			if (tempSum != 0) {
				System.out.println("Sum: " + tempSum);
			}
			sum += tempSum;
			tempSum = 0;

		}
		System.out.println("The sum of elements is: " + sum);

	}

}
