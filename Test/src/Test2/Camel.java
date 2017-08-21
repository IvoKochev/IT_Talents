package Test2;

public class Camel implements Ridable{

	int weight = 2;
	public static void main(String[] args) {
		new Camel().go(8);
	}
	
	void go(int speed) {
		++speed;
		weight++;
		int walkrate =  speed*weight;
		System.out.println(walkrate + getGait());
	}
	
	public String getGait() {
		return " mph, lope";
	}
	
}
