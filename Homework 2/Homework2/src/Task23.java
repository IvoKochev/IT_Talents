
public class Task23 {

	public static void main(String[] args) {
		int counter = 1;
		int a = 1;
		while (counter < 10) {
			if (a > 9) {
				counter++;
				a = counter;
				System.out.println();
			} else {
				System.out.print(counter + "*" + a + ";");
				a++;
			}

		}

	}

}
