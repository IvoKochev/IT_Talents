
public class ProductPerKg extends Product {
	private double kg;
	public ProductPerKg(String name, double price, double kg) {
		super(name, price);
		if(kg > 0) {
			this.kg = kg;
		} else {
			this.kg = 1;
		}
	}
	public double getKg() {
		return kg;
	}
	public void setKg(double kg) {
		if(kg >= 0) {
			this.kg = kg;
		}
	}

	
	

}
