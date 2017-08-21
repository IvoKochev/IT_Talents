
public class Task1 {

	public static void main(String[] args) {
		int[][] array = {{1,2,3,4,5}, {5,12,13,15,21}, {1,5,6,2,4}, {22, 11, 35,52, 21}, {6, 7, 8, 1, 3}, {11, 15,2, 10, 2, 3}};
		int min = array[0][0];
		int max = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++){
				if(array[i][j] < min){
					min = array[i][j];
				}
				if(array[i][j] > max){
					max = array[i][j];
				}
			}
		}
		
		System.out.println("The biggest element is: " + max + " and the smallest element is: " + min);

	}

}
