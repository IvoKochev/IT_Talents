
public class Task3 {

	public static void main(String[] args) {
		double[][] array = {{1, 2, 5, 4}, {11, 12, 35, 60}, {0, -5, 13, 20}, {1, 11, 31, 15}};
		double sum = 0;
		//use avg as the avg and as a counter to count the whole array length
		double avg = 0;
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length;j++){
				sum+= array[i][j];
				avg++;
			}
		}
		avg = sum/avg;
		System.out.println("The sum is: " + sum + " and the average is: " + avg);

	}

}
