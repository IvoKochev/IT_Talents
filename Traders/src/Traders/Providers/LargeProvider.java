package Traders.Providers;

import java.util.List;

import Traders.Products.Product;

public class LargeProvider extends Provider{
	public static final double DISCOUNT = 0.15;
	public LargeProvider(String name, String address, String workingTime, List<Product> products) {
		super(name, address, workingTime, products);
	}

}
