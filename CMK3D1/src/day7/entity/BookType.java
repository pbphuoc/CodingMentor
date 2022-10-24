package day7.entity;

public class BookType {
	public String ISBN;
	public String typeID;

	public BookType(String ISBN, String typeID) {
		this.ISBN = ISBN;
		this.typeID = typeID;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getTypeID() {
		return typeID;
	}
}
