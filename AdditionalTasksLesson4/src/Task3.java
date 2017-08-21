
public class Task3 {

	public static void main(String[] args) {
		int tempNumber;
		for(int i = 1; i<10; i++){
			tempNumber = i;
			for(int j = 1; j<12; j++){
				if( j == 1){
					System.out.print(tempNumber + " ");
				} else if(j == 2){
					System.out.print("| ");
				} else{
					System.out.print(tempNumber + " ");
					tempNumber += i;
				}
				
			}
			System.out.println();
		}

	}

}
