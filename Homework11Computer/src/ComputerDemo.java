
public class ComputerDemo {

	public static void main(String[] args) {
		Computer dell = new Computer(2016, 1800, 1000, 400);
		Computer hp = new Computer(2017, 1800, true, 1000, 500, "Win 10");
		Computer mac = new Computer(2017, 2200, true, 750, 350, "Mac OS");
		Computer lenovo = new Computer(2016, 1350, true, 2000, 1200, "Linux");
		checkPrice("dell", "hp", dell.comparePrice(hp));
		checkPrice("lenovo", "mac", lenovo.comparePrice(mac));
	}
	static void checkPrice(String name, String name1, int price) {
		if(price == -1) {
			System.out.println(name + " is more expensive than " + name1);
		} else if(price == 1) {
			System.out.println(name1 + " is more expensive than " + name);
		} else {
			System.out.println("They both cost the same!");
		}
	}
	
	

}
