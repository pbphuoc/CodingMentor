
public class Shipping {
	private String shippingID;
	private String receiverName;
	private Address receiverAddress;
	private PhoneNumber receiverPhoneNumber;
	private double shippingFee;
	private String expectedDeliveryDate;
	private String actualDeliveryDate;

	public Shipping(String shippingID, String receiverName, Address receiverAddress, PhoneNumber receiverPhoneNumber) {
		this.shippingID = shippingID;
		this.receiverName = receiverName;
		this.receiverAddress = receiverAddress;
		this.receiverPhoneNumber = receiverPhoneNumber;
		calculateShippingFee();
	}

	public void calculateShippingFee() {
		this.shippingFee = 0;

	}

	public String getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}

	public void setExpectedDeliveryDate(String expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}

	public String getActualDeliveryDate() {
		return actualDeliveryDate;
	}

	public void setActualDeliveryDate(String actualDeliveryDate) {
		this.actualDeliveryDate = actualDeliveryDate;
	}

	public String getShippingID() {
		return shippingID;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public Address getReceiverAddress() {
		return receiverAddress;
	}

	public PhoneNumber getReceiverPhoneNumber() {
		return receiverPhoneNumber;
	}

	public double getShippingFee() {
		return shippingFee;
	}

}
