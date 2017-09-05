package Traders.Traders;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import Traders.Products.Product;
import Traders.Providers.Provider;
import Traders.Providers.RetailProvider;
import Traders.TraderObjects.Shop;
import Traders.TraderObjects.TraderObject;

public class SingleTrader extends Trader{
	private TraderObject object;
	private Set<RetailProvider> providers;
	
	public SingleTrader(String name, String address, double capital, TraderObject object, Set<RetailProvider> providers) {
		super(name, address, capital);
		if(object != null && !(object instanceof Shop)) {
			this.object = object;
		}
		providers = new HashSet<RetailProvider>();
		if(providers.size() <= 5) {
			this.providers = providers;
		}
		
	}

	@Override
	public void makeOrder(double money, Provider provider, TraderObject traderObject) {
		if(isLegal(money, provider, traderObject)) {
			this.setCapital(this.getCapital() - money);
			if(this.providers.contains(provider)) {
				int productsToBuy = 0;
				double prices = 0;
				do {
				productsToBuy = new Random().nextInt(10);
				} while(productsToBuy >= provider.getProducts().size());
				do {
					int randomProduct = new Random().nextInt(provider.getProducts().size());
					int index = 0;
					for(Product p : provider.getProducts()) {
						if(randomProduct == index && !this.object.getProducts().contains(p)) {
							prices += p.getPrice();
							if(money < prices) {
								prices -= p.getPrice();
								break;
							}
							this.object.getProducts().add(p);
						}
					}
					
				} while(this.object.getProducts().size() < productsToBuy);
				this.setCapital(money - prices + this.getCapital());
			}
		}
		
	}

	@Override
	public void takeMoney() {
			int randomSoldProducts = new Random().nextInt(object.getProducts().size());
			int index = 0;
			for(Product p : this.object.getProducts()) {
				this.setCapital(this.getCapital() + p.getPrice() * OVERCHARGE);
				this.object.getProducts().remove(p);
				if(randomSoldProducts == index) {
					break;
				}
				index++;
			}
		
	}

	@Override
	public void payTaxes(TraderObject traderObject) {
		if(this.object.equals(traderObject)) {
			this.setCapital(this.getCapital() - this.object.getTax());
		} else {
			System.out.println("Invalid trader object!");
		}
		
	}

	

}
