package day5cardealer;

public class Customer {
	private String customerID;
	private String customerName;

	public Customer(String customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerID() {
		return customerID;
	}
}
