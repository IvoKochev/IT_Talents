package Traders.TraderObjects;

import java.util.List;

import Traders.Products.Product;

public class Shop extends TraderObject{

	public Shop(String address, String workingTime, double area, List<Product> products) {
		super(address, workingTime, area, 150, products);
	}

}
