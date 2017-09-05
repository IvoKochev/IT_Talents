package Traders.Traders;

import java.util.List;
import java.util.Random;

import Traders.Products.Product;
import Traders.Providers.Provider;
import Traders.Providers.RetailProvider;
import Traders.TraderObjects.TraderObject;

public class AmbulatoryTrader extends Trader{
	private RetailProvider provider;
	private List<Product> products;
	public AmbulatoryTrader(String name, String address, double capital, RetailProvider provider, List<Product> products) {
		super(name, address, capital);
		if(provider != null) {
			this.provider = provider;
		} else {
				this.provider = new RetailProvider("Ivo", "Sofia, Studentski grad", "09:00 - 18:00", null);
		}
		this.products = products;
	}
	@Override
	public void makeOrder(double money, Provider provider, TraderObject traderObject) {
		if(isLegal(money, provider, traderObject)) {
			this.setCapital(this.getCapital() - money);
			if(this.provider.equals(provider)) {
				int productsToBuy = 0;
				double prices = 0;
				do {
				productsToBuy = new Random().nextInt(10);
				} while(productsToBuy >= provider.getProducts().size());
				do {
					int randomProduct = new Random().nextInt(provider.getProducts().size());
					int index = 0;
					for(Product p : provider.getProducts()) {
						if(randomProduct == index && !this.products.contains(p)) {
							prices += p.getPrice();
							if(money < prices) {
								prices -= p.getPrice();
								break;
							}
							this.products.add(p);
						}
					}
					
				} while(products.size() < productsToBuy);
				this.setCapital(money - prices + this.getCapital());
			}
		}
		
	}
	@Override
	public void takeMoney() {
			int randomSoldProducts = new Random().nextInt(products.size());
			int index = 0;
			for(Product p : products) {
				this.setCapital(this.getCapital() + p.getPrice() * OVERCHARGE);
				products.remove(p);
				if(randomSoldProducts == index) {
					break;
				}
				index++;
			}
		
	}
	@Override
	public void payTaxes(TraderObject traderObject) {
		System.out.println("This is an ambulatory trader, he doesn't pay tax!");
		
	}
	public RetailProvider getProvider() {
		return provider;
	}
	public List<Product> getProducts() {
		return products;
	}
	
	

}
