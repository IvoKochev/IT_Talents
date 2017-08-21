
public class Task5 {

	public static void main(String[] args) {
		int[][] array = {{1, 5, 11, 22},
						{0, 9, 16,-5},
						{4, 23, 1, 2},
						{9, 19, 12, 4}};
		//holds the highest sum on rows
		int rowSum = 0;
		//holds the highest sum on rows
		int colSum = 0;
		//holds the current row sum
		int tempRowSum = 0;
		//holds the current col sum
		int tempColSum = 0;
		for(int i = 0; i < array.length; i ++){
			for(int j = 0; j < array[i].length; j++){
				tempRowSum += array[i][j];
				tempColSum += array[j][i];
			}
			if(tempRowSum > rowSum){
				rowSum = tempRowSum;
			}
			if(tempColSum > colSum){
				colSum = tempColSum;
			}
			tempRowSum = 0;
			tempColSum = 0;
		}
		System.out.println("The max sum on rows is: " + rowSum + " and the max sum on columns is: " + colSum);
		System.out.println("Max sum on rows " + (rowSum > colSum ? ">" : "<") + " max sum on columns!");
		
	}

}
