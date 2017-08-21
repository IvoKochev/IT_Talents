import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence with intervals: ");
		str = sc.nextLine();
		String[] sentence = str.split(" ");
		for(int i = 0; i < sentence.length; i++) {
			System.out.print(sentence[i].substring(0, 1).toUpperCase() + sentence[i].substring(1, sentence[i].length()).toLowerCase() + " ");
		}
		sc.close();

	}

}
