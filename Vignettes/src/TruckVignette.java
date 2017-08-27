import java.time.LocalDate;

public class TruckVignette extends Vignette {
	private static final int DAYLY_PRICE = 7;
	private static final int MONTHLY_PRICE = 40;
	private static final int YEARLY_PRICE = 420;

	public TruckVignette(LocalDate date, Period period) {
		super(date, period);
		
		if(period == Period.DAYLY) {
			this.setPrice(DAYLY_PRICE);
		} else if(period == Period.MONTHLY) {
			this.setPrice(MONTHLY_PRICE);
		} else {
			this.setPrice(YEARLY_PRICE);
		}
	}
	
}
