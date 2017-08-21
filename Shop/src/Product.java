
public abstract class Product {
	private String name;
	private double price;
	Product(String name, double price) {
		if(name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			this.name = "No name";
		}
		if(price > 0) {
			this.price = price;
		} else {
			this.price = 2;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public boolean equals(Product product) {
		if(this instanceof ProductPerPiece && product instanceof ProductPerPiece) {
			if(this.getName().equals(product.getName())) {
				return true;
			} else {
				return false;
			}
		} else if(this instanceof ProductPerKg && product instanceof ProductPerKg) {
			if(this.getName().equals(product.getName())) {
				return true;
			} else {
				return false;
			}
			
		} else {
			return false;
		}
	}

	public double getPrice() {
		return price;
	}

	
	
}
