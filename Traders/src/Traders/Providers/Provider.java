package Traders.Providers;

import java.util.ArrayList;
import java.util.List;

import Traders.Person;
import Traders.Products.Product;

public abstract class Provider extends Person {
	private String workingTime;
	private List<Product> products = new ArrayList<Product>();
	
	public Provider(String name, String address, String workingTime, List<Product> products) {
		super(name, address);
		if(workingTime != null && !workingTime.isEmpty()) {
			this.workingTime = workingTime;
		} else {
			this.workingTime = "09:00 - 18:00";
		}
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}
	
	

}
