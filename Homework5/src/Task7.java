
public class Task7 {

	public static void main(String[] args) {
		int[][] array = {{1, 5, 11, 22, 32, 6},
						{15, 12, 13, 25, 61, 22},
						{1, 2, 3, 4, 5, 6},
						{10, 11, 15, 13, 14, 12},
						{22, 12, 11, 62, 34, 21},
						{9, 8, 6, 5, 4, 3}};
		//holds the whole sum
		int sum = 0;
		//holds the sum of the current row
		int tempSum = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++){
				if((i+j)%2 == 0 ){
					tempSum += array[i][j];	
					System.out.print(array[i][j] + ",");
				} else if(j == 0){
					continue;
				} else {
					System.out.print(" ,");
				}
			}
			System.out.println(" Sum of the elements of this row: " + tempSum);
			sum += tempSum;
			tempSum = 0;
		}
		System.out.println("Sum of all the elements: " + sum);
		
	}

}
