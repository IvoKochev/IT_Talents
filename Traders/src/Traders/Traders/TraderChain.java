package Traders.Traders;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import Traders.Products.Product;
import Traders.Providers.Provider;
import Traders.TraderObjects.TraderObject;

public class TraderChain extends Trader {
	private Set<Provider> providers;
	private Set<TraderObject> objects;

	public TraderChain(String name, String address, double capital, Set<Provider> providers,
			Set<TraderObject> objects) {
		super(name, address, capital);
		this.providers = new HashSet<Provider>();
		if (providers != null && providers.size() <= 15) {
			this.providers = providers;
		}
		if (objects != null) {
			this.objects = objects;
		}

	}

	@Override
	public void makeOrder(double money, Provider provider, TraderObject traderObject) {
		if (isLegal(money, provider, traderObject)) {
			if (this.providers.contains(provider)) {
				int productsToBuy = 0;
				double prices = 0;
				productsToBuy = new Random().nextInt(provider.getProducts().size());
				List<Product> products = new ArrayList<Product>();
				do {
					int randomProduct = new Random().nextInt(provider.getProducts().size());
					int index = 0;
					for (Product p : provider.getProducts()) {
						if (randomProduct == index && !products.contains(p)) {
							prices += p.getPrice();
							if (money < prices) {
								prices -= p.getPrice();
								break;
							}
							traderObject.addProduct(p);
							products.add(p);
						}
						index++;
					}

				} while (traderObject.getProducts().size() < productsToBuy);
				this.setCapital(this.getCapital() - (money - prices));
			}
		}
		System.out.println("Done");

	}

	@Override
	public void takeMoney() {
		for(TraderObject ob : objects) {
			int randomSoldProducts = new Random().nextInt(ob.getProducts().size());
			int index = 0;
			for(Product p : ob.getProducts()) {
				this.setCapital(this.getCapital() + p.getPrice() * OVERCHARGE);
				ob.getProducts().remove(p);
				if(randomSoldProducts == index) {
					break;
				}
				index++;
			}
		}

	}

	@Override
	public void payTaxes(TraderObject traderObject) {
		if(this.objects.contains(traderObject)) {
			this.setCapital(this.getCapital() - traderObject.getTax());
		}  else {
			System.out.println("Invalid trader object!");
		}

	}

	@Override
	public String toString() {
		return "TraderChain [providers=" + providers + ", objects=" + objects + "]";
	}

	public Set<Provider> getProviders() {
		return providers;
	}

	public Set<TraderObject> getObjects() {
		return objects;
	}

}
