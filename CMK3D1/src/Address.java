
public class Address {
	private String unit = "";
	private String number;
	private String street;
	private String suburb;
	private String state;
	private String country;
	private String postCode;

	public Address(String number, String street, String suburb, String state, String country, String postCode) {
		this.number = number;
		this.state = street;
		this.suburb = suburb;
		this.state = state;
		this.country = country;
		this.postCode = postCode;
	}

	public String getUnit() {
		return unit;
	}

	public String getNumber() {
		return number;
	}

	public String getStreet() {
		return street;
	}

	public String getSuburb() {
		return suburb;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public String getPostCode() {
		return postCode;
	}

}
