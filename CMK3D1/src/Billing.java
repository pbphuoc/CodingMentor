
public class Billing {
	private Cart cart;
	private User customer;

	public Billing(Cart cart, User customer) {
		this.cart = cart;
		this.customer = customer;
	}

	public Cart getCart() {
		return cart;
	}

	public User getCustomer() {
		return customer;
	}

}
