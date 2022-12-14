import java.time.format.DateTimeFormatter;

public class Order {
	private String orderID;
	private String orderDate;
	private Billing billing;
	private Shipping shipping;
	private Payment payment;
	private Constant.OrderStatus orderStatus = Constant.OrderStatus.RECEIVED;
	private static DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("DD-MM-YYYY");

	public Order(String orderID, Billing billing, Shipping shipping, Payment payment) {
		this.orderID = orderID;
		this.billing = billing;
		this.shipping = shipping;
		this.payment = payment;
		this.orderDate = java.time.LocalDate.now().format(dateFormater).toString();
	}

	public Constant.OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Constant.OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Billing getBilling() {
		return billing;
	}

	public Payment getPayment() {
		return payment;
	}

	public Shipping getShipping() {
		return shipping;
	}

	public String getOrderID() {
		return orderID;
	}

	public String getOrderDate() {
		return orderDate;
	}
}
