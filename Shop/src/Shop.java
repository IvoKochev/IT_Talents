
public class Shop {
	private String name;
	private String addres;
	private double money;
	private Product[] products;
	
	Shop() {
		this.name = "";
		this.addres = "";
		this.money = 1000;
		this.products = new Product[200];
	}
	Shop(String name, String addres, double money, int numberOfProducts) {
		this();
		if(name != null && !name.isEmpty()) {
			this.name = name;
		}
		if(addres != null && !addres.isEmpty()) {
			this.addres = addres;
		}
		if(money >= 0) {
			this.money = money;
		}
		if(numberOfProducts > 20) {
			this.products = new Product[numberOfProducts];
		}
	}

	void addProduct(Product product) {
		if(product != null) {
			for(int i = 0; i < this.products.length; i++) {
				if(this.products[i].equals(product)) {
					if(product instanceof ProductPerKg) {
						((ProductPerKg) this.products[i]).setKg(((ProductPerKg) this.products[i]).getKg() + ((ProductPerKg)product).getKg());
						System.out.println("Product: " + product.getName() + " has been added to the shop!");
						break;
					} else if(product instanceof ProductPerPiece) {
						((ProductPerPiece) this.products[i]).setNumber(((ProductPerPiece) this.products[i]).getNumber() + ((ProductPerPiece) product).getNumber());
						System.out.println("Product: " + product.getName() + " has been added to the shop!");
						break;
					}
				}
			}
		} else {
			System.out.println("No product has been added!");
		}
	}
	public String getName() {
		return name;
	}
	public Product[] getProducts() {
		return products;
	}

}

