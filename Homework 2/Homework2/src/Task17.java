import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		int length;
		char sign;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the square [3-20]: ");
		length = sc.nextInt();
		if(length < 3 || length >20){
			System.out.println("Invalid length!");
		}else {
		System.out.println("Enter the char to fullfill the square with: ");
		sign = sc.next().charAt(0);
		for(int i =0; i < length; i++){
			for(int j = 0; j< length; j++){
				if(i == 0 || i == length - 1){
					System.out.print("*");
				} else if(i > 0 && i< length - 1 && j != 0 && j != length - 1){
					System.out.print(sign);
				} else if(i>0 && i < length - 1){
					System.out.print("*");
				}
				
			}
			System.out.println("");
		}
		}
		sc.close();
		

	}

}
