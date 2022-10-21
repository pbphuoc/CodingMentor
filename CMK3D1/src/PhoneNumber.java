
public class PhoneNumber {
	private String phoneNumber;
	private Constant.PhoneNumberType phoneNumberType;

	public PhoneNumber(String phoneNumber, Constant.PhoneNumberType phoneNumberType) {
		this.phoneNumber = phoneNumber;
		this.phoneNumberType = phoneNumberType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Constant.PhoneNumberType getPhoneNumberType() {
		return phoneNumberType;
	}
}
