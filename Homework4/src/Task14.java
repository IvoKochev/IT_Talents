
public class Task15 {

	public static void main(String[] args) {
		double[] array = {2.5, -2.4, 2.22, -1.98, 19.07, 0.5, -1.99, 3.01, -5.27, 10, -50, 0.34, -5.25, 3.14};
		int counter = 0;
		for(int i = 0; i < array.length; i ++){
			if(array[i] > - 2.99 && array[i] < 2.99){
				//counts the elements in the interval
				counter++;
			}
		}
		if(counter < 0){
			System.out.println("There are no numbers in [-2.99..2.99]");
		} else{
			//make array with the length = number of elements in the interval
			double[] helpArr = new double[counter];
			// iterator for the second array
			int counter2=0;
			for(int i = 0; i < array.length; i ++){
				if(array[i] > - 2.99 && array[i] < 2.99){
					helpArr[counter2] = array[i];
					counter2++;
				}
			}
			for(int i = 0; i < helpArr.length; i++){
				System.out.print(helpArr[i] + (i == helpArr.length-1 ? "" : "; "));
			}
		}

	}

}
