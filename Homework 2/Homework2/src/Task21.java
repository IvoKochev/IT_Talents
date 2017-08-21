import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		int number, flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number [1-52]");
		number = sc.nextInt();
		if (number > 0 && number < 53) {
			for (int i =number/4+2; i < 15; i++) {
				
				for (int j = 0; j < 4; j++) {

					if(flag == 0){
						j = number%4;
						flag =1 ;
					}
					if(i<11){
						System.out.print(i + " ");
					} else if(i == 11){
						System.out.print("Jack ");
					} else if(i ==12 ){
						System.out.print("Lady  ");
					} else if(i ==13 ) {
						System.out.print("Pop ");
					} else if (i == 14) {
						System.out.print("Ase ");
					}
					if(j == 0){
						System.out.print("Spatia,");
					} else if(j == 1){
						System.out.print("Karo,");
					} else if(j == 2){
						System.out.print("Heart,");
					} else if (j ==3){
						System.out.print("Pika,");
					}
					
				}
			}
			sc.close();
			

		}

	}

}
