
public abstract class Vehicle {
	private String model;
	private int year;
	private Vignette vignette;
	private Driver owner;

	public Vehicle(String model, int year, Driver owner) {
		if (model != null && !model.isEmpty()) {
			this.model = model;
		}
		if (year > 1950 && year < 2018) {
			this.year = year;
		} else {
			this.year = 2010;
		}
		if (owner != null) {
			this.owner = owner;
		}
		
	}

	public Vignette getViggnette() {
		return this.vignette;
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", year=" + year + "]";
	}
	
	public void addVegnette(Vignette v) {
		this.vignette = v;
	}
	
	public void showVignette() {
		System.out.println(this.vignette.toString());
	}

	

}
