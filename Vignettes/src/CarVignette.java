import java.time.LocalDate;

public class CarVignette extends Vignette {
	
	
	private static final int DAYLY_PRICE = 5;
	private static final int MONTHLY_PRICE = 50;
	private static final int YEARLY_PRICE = 300;

	public CarVignette(LocalDate date, Period period) {
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
