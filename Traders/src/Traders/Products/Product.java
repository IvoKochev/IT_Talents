package Traders.Products;

public class Product {
	private String name;
	private double price;
	public Product(String name, double price) {
		if(name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			this.name = "Chocolate";
		}
		if(price >= 5 && price <= 15) {
			this.price = price;
		} else {
			this.price = 10;
		}
	}
	public double getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	

}
