package Traders;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import Traders.Products.Product;
import Traders.Providers.LargeProvider;
import Traders.Providers.Provider;
import Traders.Providers.RetailProvider;
import Traders.Traders.AmbulatoryTrader;
import Traders.Traders.SingleTrader;
import Traders.Traders.Trader;
import Traders.Traders.TraderChain;
import Traders.TraderObjects.Box;
import Traders.TraderObjects.Shop;
import Traders.TraderObjects.Stall;
import Traders.TraderObjects.TraderObject;;

public class Demo {
	public static final int NUMBER_OF_PRODUCTS = 100;
	public static final int MINIMUM_PRODUCTS_FOR_PROVIDERS = 5;
	public static final int BOX_AREA = 3;
	public static final int STALL_AREA = 9;
	public static final int SHOP_AREA = 90;

	public static void main(String[] args) {

		final String[] names = { "Ivo", "Pesho", "Ivan", "Gosho", "Misho" };
		final String[] addresses = { "Sofia, Studentski grad", "Sofia, Drujba 2", "Sofia, Mladost 3",
				"Sofia, Lulin 10" };
		final String[] workingTimes = { "09:00 - 18:00", "08:00 - 17:00", "10:00 - 19:00" };
		final String[] productNames = { "Chicken", "Chocolate", "Milk", "Cheese", "Croissant", "Ketchup", "Computer",
				"Laptop" };
		final double[] productPrices = { 5, 5.50, 6, 6.50, 7, 7.50, 8, 8.50, 9, 9.50, 10, 10.50, 11, 11.50, 12, 13, 14,
				15 };

		// making products

		List<Product> products = new ArrayList<Product>();
		for (int i = 0; i < 100; i++) {
			String productName = productNames[new Random().nextInt(productNames.length)];
			double productPrice = productPrices[new Random().nextInt(productPrices.length)];
			Product product = new Product(productName, productPrice);
			products.add(product);
		}

		// making providers

		Set<Provider> providers = new HashSet<Provider>();
		for (int i = 0; i < 20; i++) {
			int providerType = new Random().nextInt(2);
			String name = names[new Random().nextInt(names.length)];
			String address = addresses[new Random().nextInt(addresses.length)];
			String workingTime = workingTimes[new Random().nextInt(workingTimes.length)];
			if (providerType == 0) {
				Provider provider = new RetailProvider(name, address, workingTime,
						getSomeProducts(products, new Random().nextInt(30) + MINIMUM_PRODUCTS_FOR_PROVIDERS));
				providers.add(provider);
			} else {
				Provider provider = new LargeProvider(name, address, workingTime,
						getSomeProducts(products, new Random().nextInt(50) + MINIMUM_PRODUCTS_FOR_PROVIDERS));
				providers.add(provider);
			}
		}

		// making trader objects

		Set<TraderObject> traderObjects = new HashSet<TraderObject>();
		for (int i = 0; i < 20; i++) {
			int objectType = new Random().nextInt(3);
			String address = addresses[new Random().nextInt(addresses.length)];
			String workingTime = workingTimes[new Random().nextInt(workingTimes.length)];
			switch (objectType) {
			case 0:
				int shopArea = new Random().nextInt(SHOP_AREA) + 10;
				TraderObject shop = new Shop(address, workingTime, shopArea, null);
				traderObjects.add(shop);
				break;
			case 1:
				int boxArea = new Random().nextInt(BOX_AREA) + 4;
				TraderObject box = new Box(address, workingTime, boxArea, null);
				traderObjects.add(box);
				break;
			case 2:
				int stallArea = new Random().nextInt(STALL_AREA) + 2;
				TraderObject stall = new Box(address, workingTime, stallArea, null);
				traderObjects.add(stall);
				break;

			}
		}

		// making traders
		List<Trader> traders = new ArrayList<Trader>();
		String aName = names[new Random().nextInt(names.length)];
		String aAddress = addresses[new Random().nextInt(addresses.length)];
		Trader ambulatoryTrader = new AmbulatoryTrader(aName, aAddress, 100,
				(RetailProvider) getRetailProvider(providers), null);
		String sName = names[new Random().nextInt(names.length)];
		String sAddress = addresses[new Random().nextInt(addresses.length)];
		Trader singleTrader = new SingleTrader(sName, sAddress, 500, getBoxOrStall(traderObjects),
				getNumberOfRetailProviders(providers, new Random().nextInt(5) + 1));
		String tName = names[new Random().nextInt(names.length)];
		String tAddress = addresses[new Random().nextInt(addresses.length)];
		Trader traderChain = new TraderChain(tName, tAddress, 3000,
				getNumberOfProviders(providers, new Random().nextInt(15) + 1, new HashSet<Provider>()),
				getNumberOfTraderObjects(traderObjects, new Random().nextInt(10) + 1));
		traders.add(ambulatoryTrader);
		traders.add(singleTrader);
		traders.add(traderChain);
		System.out.println(((TraderChain)traderChain).getProviders().size() + " " + ((TraderChain)traderChain).getObjects().size());
		System.out.println("capital before: " + traderChain.getCapital());
		System.out.println("before order" + traderChain.toString());
		traderChain.makeOrder(500, getRetailProvider(((TraderChain)traderChain).getProviders()), getBoxOrStall(((TraderChain)traderChain).getObjects()));
		System.out.println("capital after: " + traderChain.getCapital());
		System.out.println("after order: " + traderChain.toString());
	}

	static Provider getRetailProvider(Set<Provider> providers) {
		for (Provider p : providers) {
			if (p instanceof RetailProvider) {
				return p;
			}
		}
		return new RetailProvider(null, null, null, null);
	}

	static Set<RetailProvider> getNumberOfRetailProviders(Set<Provider> providers, int number) {
		Set<RetailProvider> providersToReturn = new HashSet<RetailProvider>();
		List<RetailProvider> providersToCheck = new ArrayList<RetailProvider>();
		do {
			for (Provider p : providers) {
				if (p instanceof RetailProvider) {
					boolean isThere = false;
					for (Provider pr : providersToCheck) {
						if (p.equals(pr)) {
							isThere = true;
							break;
						}
					}
					if (!isThere) {
						providersToReturn.add((RetailProvider) p);
						providersToCheck.add((RetailProvider) p);
						break;
					}
				}
			}
		} while (providersToReturn.size() < number);
		return providersToReturn;

	}

	static TraderObject getBoxOrStall(Set<TraderObject> objects) {
		for (TraderObject o : objects) {
			if (o instanceof Box || o instanceof Stall) {
				return o;
			}
		}

		return new Box(null, null, 0, null);
	}

	static Set<Provider> getNumberOfProviders(Set<Provider> providers, int number, Set<Provider> providersToReturn) {
		providersToReturn = new HashSet<Provider>();
		List<Provider> providersToCheck = new ArrayList<Provider>();
		do {
			for (Provider p : providers) {
				boolean isThere = false;
				for (Provider pr : providersToCheck) {
					if (p.equals(pr)) {
						isThere = true;
						break;
					}
				}
				if (!isThere) {
					providersToReturn.add(p);
					providersToCheck.add(p);
					break;
				}
			}
		} while (providersToReturn.size() < number);
		System.out.println("number of providers: " + providersToReturn.size());
		System.out.println("returning providers");
		return providersToReturn;
	}

	static Set<TraderObject> getNumberOfTraderObjects(Set<TraderObject> traderObjects, int number) {
		Set<TraderObject> traderObjectsToReturn = new HashSet<TraderObject>();
		List<TraderObject> traderObjectsToCheck = new ArrayList<TraderObject>();
		do {
			for (TraderObject t : traderObjects) {
				boolean isThere = false;
				for (TraderObject tr : traderObjectsToCheck) {
					if (t.equals(tr)) {
						isThere = true;
						break;
					}

				}
				if (!isThere) {
					traderObjectsToReturn.add(t);
					traderObjectsToCheck.add(t);
				}
			}
		} while (traderObjectsToReturn.size() < number);
		System.out.println("after returning objects");
		return traderObjectsToReturn;
	}

	static List<Product> getSomeProducts(List<Product> products, int number) {
		List<Product> productsToReturn = new ArrayList<Product>();
		for (int i = 0; i < number; i++) {
			int index = 0;
			int randomProduct = new Random().nextInt(NUMBER_OF_PRODUCTS);
			for (Product p : products) {
				if (index == randomProduct) {
					productsToReturn.add(p);
					break;
				}
				index++;
			}
		}
		return productsToReturn;
	}
}
