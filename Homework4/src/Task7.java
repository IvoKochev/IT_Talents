
public class Task7 {

	public static void main(String[] args) {
		int[] array = {1, 5, 13, 6, 16, 25, 32, 11, 15};
		int[] array1 = new int[array.length];
		for(int i = 0; i < array.length; i ++){
			if(i ==0 || i== array.length-1){
				array1[i] = array[i];
			} else{
				array1[i] = array[i-1] + array[i+1];
			}
		}
		for(int i = 0; i < array.length; i++){
			System.out.println("[" + i + "]: " + array1[i]);
		}

	}

}
