import java.time.LocalDate;

;
public abstract class Vignette implements IVignette{


	private int price;
	private LocalDate date;
	private String color;
	private Period period;
	
	public Vignette(LocalDate date, Period period) {
		if(this instanceof CarVignette) {
			this.color = "Green";
		} else if(this instanceof BusVignette) {
			this.color = "Red";
		} else {
			this.color = "Yellow";
		}
		this.period = period;
		this.date = date;
		
	}
	
	public LocalDate getDate() {
		return date;
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPrice(int price) {
		if(price > 0) 
			this.price = price;
	}

	@Override
	public int glueVignette(Vignette vignette) {
		if(vignette instanceof CarVignette) {
			return 5;
		} else if(vignette instanceof TruckVignette) {
			return 10;
		}
		return 20;
	}

	@Override
	public int getPrice(Vignette vignette) {
		return vignette.price;
	}
	
	public void getInfo() {
		System.out.println(this.getClass().getName() + " Price: " + this.price + " Color: " + this.color + " Period: " + this.period);
	}
	
	@Override
	public String toString() {
		return "Vignette [price=" + price + ", date=" + date + ", color=" + color + ", period=" + period + "]";
	}
	
	
	
	

}
