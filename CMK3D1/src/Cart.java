
public class Cart {
	private String cartID;
	private CartDetail[] cartDetails;
	private double total;

	public Cart(String cartID, CartDetail[] cartDetails) {
		this.cartID = cartID;
		this.cartDetails = cartDetails;
		for(CartDetail cartDetail : cartDetails) {
			total += cartDetail.getSubtotal();
		}
	}

	public String getOrderID() {
		return cartID;
	}

	public CartDetail[] getCartDetails() {
		return cartDetails;
	}

	public void addMoreCardDetail(CartDetail newDetail) {
		CartDetail[] newDetails = new CartDetail[cartDetails.length + 1];
		for (int i = 0; i < cartDetails.length; i++) {
			newDetails[i] = cartDetails[i];
		}
		newDetails[cartDetails.length] = newDetail;
		cartDetails = newDetails;
		total += newDetail.getSubtotal();
	}
	
	public double getTotal() {
		return total;
	}
}
