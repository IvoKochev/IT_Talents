package Traders.TraderObjects;

import java.util.List;

import Traders.Products.Product;

public class Box extends TraderObject{

	public Box(String address, String workingTime, double area, List<Product> products) {
		super(address, workingTime, area, 50, products);
	}

}
