
public class Car {
	private String brand;
	private String model;
	private String color;
	private double cost;
	private int yearOfProduction;
	private double maxSpeed;
	
	Car(String brand, String model, String color, double cost, int yearOfProduction, double maxSpeed) {
		if(brand != null && !brand.equals("")) {
			this.brand= brand;
		}
		if(model != null && !model.equals("")) {
			this.model= model;
		}
		if(color != null && !color.equals("")) {
			this.color= color;
		}
		if(cost > 300) {
			this.cost = cost;
		} else {
			this.cost = 5000;
		}
		if(yearOfProduction < 2018 && yearOfProduction > 1950) {
			this.yearOfProduction = yearOfProduction;
		} else {
			this.yearOfProduction = 2010;
		}
		if(maxSpeed > 50) {
			this.maxSpeed = maxSpeed;
		} else {
			this.maxSpeed = 200;
		}
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
