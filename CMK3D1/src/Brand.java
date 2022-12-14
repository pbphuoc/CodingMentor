
public class Brand {
	private String brandID;
	private String brandName;
	private String email;
	private Address officeAddress;
	private PhoneNumber[] phoneNumbers;
	
	public Brand(String brandID, String brandName, String email) {
		this.brandID = brandID;
		this.brandName = brandName;
		this.email = email;
	}

	public String getBrandID() {
		return brandID;
	}

	public String getBrandName() {
		return brandName;
	}

	public String getEmail() {
		return email;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public PhoneNumber[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public void addPhoneNumbers(PhoneNumber newNumber) {
		if (this.phoneNumbers == null) {
			this.phoneNumbers = new PhoneNumber[]{newNumber};
		}else {
			PhoneNumber[] newNumbers = new PhoneNumber[this.phoneNumbers.length + 1];
			for (int i = 0; i < this.phoneNumbers.length; i++) {
				newNumbers[i] = this.phoneNumbers[i];
			}
			newNumbers[this.phoneNumbers.length] = newNumber;
			this.phoneNumbers = newNumbers;
		}
	}
}
