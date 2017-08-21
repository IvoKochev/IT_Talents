
public class CarShop {
	
	private Car[] car;
	private int capacity;
	
	CarShop() {
		this.car = new Car[5];
	}
	CarShop(int capacity) {
		if(capacity >= 5) {
			this.capacity = capacity;
		} else {
			this.capacity = 5;
		}
	}
	public Car[] getCars() {
		return car;
	}

	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
