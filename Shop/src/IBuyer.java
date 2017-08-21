
public interface IBuyer {
	void addProductByKg(Product product, double kg);
	void addProductByPiece(Product product, int pieces);
	void removeProductByKg(Product product);
	void removeProductByPieece(Product product);

}
