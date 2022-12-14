package day7.entity;

public class BorrowReturnHistory {
	private String customerID;
	private String ISBN;
	private String borrowDate;
	private String expectedReturnDate;
	private String actualReturnDate;

	public BorrowReturnHistory(String customerID, String ISBN, String borrowDate, String expectedReturnDate) {
		this.customerID = customerID;
		this.ISBN = ISBN;
		this.borrowDate = borrowDate;
		this.expectedReturnDate = expectedReturnDate;
		this.actualReturnDate = "";
	}

	public void setActualReturnDate(String actualReturnDate) {
		this.actualReturnDate = actualReturnDate;
	}

	public String getCustomerID() {
		return customerID;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getBorrowDate() {
		return borrowDate;
	}

	public String getExpectedReturnDate() {
		return expectedReturnDate;
	}

	public String getActualReturnDate() {
		return actualReturnDate;
	}
}
