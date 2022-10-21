
public class CartDetail {
	private Product product;
	private Integer quantity;
	private double subTotal;

	public CartDetail(Product product, Integer quantity) {
		this.product = product;
		this.quantity = quantity;
		this.subTotal = product.getProductPrice() * quantity;
	}

	public Product getProduct() {
		return product;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
	public double getSubtotal() {
		return subTotal;
	}
}
