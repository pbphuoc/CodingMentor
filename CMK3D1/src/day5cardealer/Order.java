package day5cardealer;

public class Order {
	private String orderID;
	private Customer customer;
	private OrderDetail[] orderDetails;

	public Order(String orderID, Customer customer, OrderDetail[] orderDetails) {
		this.orderID = orderID;
		this.customer = customer;
		this.orderDetails = orderDetails;
	}

	public OrderDetail[] getOrderDetails() {
		return orderDetails;
	}

	public Customer getCustomer() {
		return customer;
	}

	public String getOrderID() {
		return orderID;
	}
}
