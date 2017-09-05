package Traders.TraderObjects;

import java.util.List;

import Traders.Products.Product;

public class Stall extends TraderObject{

	public Stall(String address, String workingTime, double area, List<Product> products) {
		super(address, workingTime, area, 50, products);
	}

}
