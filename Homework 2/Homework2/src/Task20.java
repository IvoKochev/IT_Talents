
public class Task20 {

	public static void main(String[] args) {
		int counter = 0;
		for(int i = 0; i<10; i++){
			counter = i;
			for(int j = 0; j<10; j++){
				if(counter > 9){
					counter = 0;
				}
				System.out.print(counter);
				counter++;
			}
			System.out.println("");
	}

}
}
