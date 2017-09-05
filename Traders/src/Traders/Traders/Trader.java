package Traders.Traders;



import java.util.List;
import java.util.Random;

import Traders.Person;
import Traders.Providers.Provider;
import Traders.TraderObjects.TraderObject;

public abstract class Trader extends Person implements ITrader{
	public static final double OVERCHARGE = 0.3;
	private double capital;
	public Trader(String name, String address, double capital) {
		super(name, address);
		if(capital > 0) {
			this.capital = capital;
		} else {
			this.capital = 1000;
		}
	}

	public void setCapital(double capital) {
		if(capital >= 0) {
			this.capital = capital;
		}
	}

	public boolean isLegal(double money, Provider provider, TraderObject traderObject) {
		if(money <= this.capital/2 && provider != null && traderObject != null) {
			return true;
		}
		return false;
	}

	public double getCapital() {
		return capital;
	}
	
	public void doEverything(List<Trader> traders) {
		for(Trader t : traders) {
			if(t instanceof AmbulatoryTrader) {
				t.makeOrder(new Random().nextDouble(), ((AmbulatoryTrader) t).getProvider(), (TraderObject) ((AmbulatoryTrader) t).getProducts());
			}
		}
	}


	}
	
	


