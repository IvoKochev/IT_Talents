
public class Task2 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 101; i++){
			if(i < 51 && i%2 != 0){
				System.out.println("Odd: " + i);
			} else if (i > 50 && i%2 == 0){
				System.out.println("Even: " + i);
			}
		}

	}

}
