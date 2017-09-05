package Traders.Traders;

import Traders.Providers.Provider;
import Traders.TraderObjects.TraderObject;

public interface ITrader {
	
	void makeOrder(double money, Provider provider, TraderObject traderObject);
	void takeMoney();
	void payTaxes(TraderObject traderObject);

}
