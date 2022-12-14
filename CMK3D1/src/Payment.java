import java.time.format.DateTimeFormatter;

public class Payment {
	private String paymentDate;
	private Constant.PaymentType paymentType;
	private double amount;
	private Address billingAddress;
	private static DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("DD-MM-YYYY");
	private Constant.PaymentStatus paymentStatus = Constant.PaymentStatus.PENDING;

	public Payment(Constant.PaymentType paymentType, double amount, Address billingAddress) {
		this.paymentDate = java.time.LocalDate.now().format(dateFormater).toString();
		this.paymentType = paymentType;
		this.amount = amount;
		this.billingAddress = billingAddress;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public Constant.PaymentType getPaymentType() {
		return paymentType;
	}

	public double getAmount() {
		return amount;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public Constant.PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(Constant.PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
}
