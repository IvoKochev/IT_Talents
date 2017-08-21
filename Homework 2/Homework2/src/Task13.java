

public class Task13 {

	public static void main(String[] args) {
		int x1 =0, x2=0, x3=0;
		for(int i = 100; i< 1000; i++){
			x1 = i/100;
			x2 = i%100;
			x2 = x2/10;
			x3 = i%10;
			if(x1!=x2 && x1!=x3 && x2!=x3){
				System.out.print(i + ",");
			}
			
			
		}

	}

}
