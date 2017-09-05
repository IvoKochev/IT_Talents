package Traders.TraderObjects;

import java.util.ArrayList;
import java.util.List;

import Traders.Products.Product;

public abstract class TraderObject {
	private String address;
	private String workingTime;
	private double area;
	private int tax;
	private List<Product> products = new ArrayList<Product>();
	public TraderObject(String address, String workingTime, double area, int tax, List<Product> products) {
		if(address != null && !address.isEmpty()) {
			this.address = address;
		} else {
			this.address = "Sofia, Studentski grad";
		}
		if(workingTime != null && !workingTime.isEmpty()) {
			this.workingTime = workingTime;
		} else {
			this.workingTime = "09:00 - 18:00";
		}
		
		if(this instanceof Box) {
			if(area >= 4 && area <= 6) {
				this.area = area;
			} else {
				this.area = 5;
			}
		} else if(this instanceof Shop) {
			if(area >= 10 && area <= 100) {
				this.area = area;
			} else {
				this.area = 50;
			}
		} else {
			if(area >= 2 && area <= 10) {
				this.area = area;
			} else {
				this.area = 6;
			}
		}
		
		this.tax = tax;
		if(products != null) {
			this.products = products;
		}
		
	}
	
	public void addProduct(Product product) {
		if(product != null) {
			this.products.add(product);
		}
	}
	
	public List<Product> getProducts() {
		return products;
	}
	public int getTax() {
		return tax;
	}
	@Override
	public String toString() {
		return "TraderObject [address=" + address + ", workingTime=" + workingTime + ", area=" + area + ", tax=" + tax
				+ ", products=" + products + "]";
	}
	
	

}
