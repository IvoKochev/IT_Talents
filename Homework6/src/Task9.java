
public class Task9 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5, 6 }, { 2, 5, 7, 8, 3, 2 }, { 11, 2, 5, 10, 23, 1 }, { 1, 5, 1, -10, 2, 12 },
				{ 15, 16, 17, 2, 3, 4 } };
		int sum = 0;
		int maxSum = 0;
		int index = 0, index1 = 0, helpindex = 0, helpindex1 = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				sum = arr[i][j] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1];
				index = i;
				index1 = j;
			}
			if (sum > maxSum) {
				maxSum = sum;
				helpindex = index;
				helpindex1 = index1;
			}
			sum = 0;

		}
		System.out.println("Max sum is: " + maxSum);
		System.out.print(arr[helpindex][helpindex1] + ", " + arr[helpindex][helpindex1 + 1]);
		System.out.println();
		System.out.print(arr[helpindex + 1][helpindex1] + ", " + arr[helpindex + 1][helpindex1 + 1]);

	}

}