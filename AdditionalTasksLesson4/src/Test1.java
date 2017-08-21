
public class Test1 extends Test {

	private double weight;
	protected double money;
	
	Test1(String name, int age, double weight, double money) {
		super(name, age);
		super.print();
		this.weight = weight;
		this.money = money;
	}
	
	Test1(double weight, double money) {
		super("pesho", 5);
		super.print();
		this.weight = weight;
		this.money = money;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
