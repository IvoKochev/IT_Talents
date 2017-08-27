import java.time.LocalDate;

public class BusVignette extends Vignette {
	private static final int DAYLY_PRICE = 9;
	private static final int MONTHLY_PRICE = 90;
	private static final int YEARLY_PRICE = 540;
	
	
	public BusVignette(LocalDate date, Period period) {
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
