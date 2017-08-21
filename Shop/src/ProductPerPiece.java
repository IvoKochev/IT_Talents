
public class ProductPerPiece extends Product {
	private int number;
	public ProductPerPiece(String name, double price, int number) {
		super(name, price);
		if(number > 0) {
			this.number = number;
		} else {
			this.number = 5;
		}
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		if(number >= 0) {
			this.number = number;
		}
	}
	

}
