import java.math.*;

public class Buyer implements IBuyer {
	private Shop shop;
	private double money;
	private int maxArticules;
	private Product[] cart;
	
	Buyer(Shop shop, double money, int maxArticules) {
		if (shop != null) {
			this.shop = shop;
		}
		if (money > 0) {
			this.money = money;
		} else {
			this.money = 50;
		}
		if (maxArticules > 0) {
			this.maxArticules = maxArticules;
			this.cart = new Product[maxArticules];
		} else {
			this.maxArticules = 10;
			this.cart = new Product[10];
		}
	}

	@Override
	public void addProductByKg(Product product, double kg) {
		if (product != null) {
			double maxKg = kg;
			maxKg = Math.ceil(maxKg);
			if (this.maxArticules > maxKg) {
				if (this.money >= product.getPrice()) {
					for(int i = 0; i < this.cart.length; i++) {
						if(this.cart[i] == null) {
							this.cart[i] = product;
							break;
						}
					}
					
				} else {
					System.out.println("Not enough money!");
				}
			} else {
				System.out.println("There is no place in the cart!");
			}

		} else {
			System.out.println("No product has been added to the cart!");
		}

	}

	@Override
	public void addProductByPiece(Product product, int pieces) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeProductByKg(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeProductByPieece(Product product) {
		// TODO Auto-generated method stub

	}

}
