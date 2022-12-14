import java.time.format.DateTimeFormatter;

public class User {

	private String ID;
	private String password;
	private String joiningDate;
	private String fullName;
	private String email;
	private Address address;
	private PhoneNumber[] phoneNumbers;
	private static DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("DD-MM-YYYY");

	public User(String ID, String password, String fullName, String email) {
		this.ID = ID.toLowerCase();
		this.password = password;
		this.fullName = fullName;
		this.email = email;
		this.joiningDate = java.time.LocalDate.now().format(dateFormater).toString();
	}

	public void setPassword(String oldPassword, String newPassword) {
		if (oldPassword == this.password)
			this.password = newPassword;
	}

	public String getID() {
		return ID;
	}

	public String getPassword() {
		return password;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public String getFullName() {
		return fullName;
	}

	public String getEmail() {
		return email;
	}

	public Address getAddress() {
		return address;
	}

	public PhoneNumber[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void addPhoneNumbers(PhoneNumber newNumber) {
		if (this.phoneNumbers == null) {
			this.phoneNumbers = new PhoneNumber[] { newNumber };
		} else {
			PhoneNumber[] newNumbers = new PhoneNumber[this.phoneNumbers.length + 1];
			for (int i = 0; i < this.phoneNumbers.length; i++) {
				newNumbers[i] = this.phoneNumbers[i];
			}
			newNumbers[this.phoneNumbers.length] = newNumber;
			this.phoneNumbers = newNumbers;
		}
	}
}
