package day7;

import java.util.ArrayList;

public class BookStoreDataSource {
//	private ArrayList<Location> locations = new ArrayList<Location>();
//	private ArrayList<Stock> stocks = new ArrayList<Stock>();
	private ArrayList<Book> books = new ArrayList<Book>();
	private ArrayList<BookType> bookTypes = new ArrayList<BookType>();
	private ArrayList<Type> types = new ArrayList<Type>();
	private ArrayList<BorrowReturnHistory> borrowReturnHistories = new ArrayList<BorrowReturnHistory>();
	private ArrayList<Customer> customers = new ArrayList<Customer>();

	public BookStoreDataSource() {
		Type typeTieuThuyet = new Type("type1", "Tieu Thuyet");
		Type typeVanHoc = new Type("type2", "Van Hoc");
		Type typeKyNangSong = new Type("type3", "Ky Nang Song");
		types.add(typeTieuThuyet);
		types.add(typeVanHoc);
		types.add(typeKyNangSong);
		Book bookNhaGiaKim = new Book("book1", "Nha Gia Kim", "Paulo Coelho");
		Book bookDacNhanTam = new Book("book2", "Dac Nhan Tam", "Dale Breckenridge Carnegie");
		Book bookQuangGanh = new Book("book3", "Quang Ganh Lo Di Va Vui Song", "Dale Breckenridge Carnegie");
		books.add(bookNhaGiaKim);
		books.add(bookDacNhanTam);
		books.add(bookQuangGanh);
		BookType bookType1 = new BookType("book1", "type1");
		BookType bookType2 = new BookType("book1", "type2");
		BookType bookType3 = new BookType("book2", "type3");
		BookType bookType4 = new BookType("book3", "type3");
		bookTypes.add(bookType1);
		bookTypes.add(bookType2);
		bookTypes.add(bookType3);
		bookTypes.add(bookType4);
		Customer customerPhuoc = new Customer("customer1", "Phuoc Pham");
		Customer customerFrank = new Customer("customer2", "Frank Pham");
		customers.add(customerPhuoc);
		customers.add(customerFrank);
		BorrowReturnHistory borrowReturn1 = new BorrowReturnHistory("customer1", "book1", "01-09-2022", "01-10-2022");
		BorrowReturnHistory borrowReturn2 = new BorrowReturnHistory("customer1", "book2", "01-09-2022", "01-10-2022");
		borrowReturn2.setActualReturnDate("24-10-2022");
		BorrowReturnHistory borrowReturn3 = new BorrowReturnHistory("customer1", "book3", "01-09-2022", "01-10-2022");
		borrowReturn3.setActualReturnDate("15-09-2022");
		BorrowReturnHistory borrowReturn4 = new BorrowReturnHistory("customer2", "book2", "15-10-2022", "15-11-2022");
		BorrowReturnHistory borrowReturn5 = new BorrowReturnHistory("customer2", "book3", "15-09-2022", "15-10-2022");
		borrowReturnHistories.add(borrowReturn1);
		borrowReturnHistories.add(borrowReturn2);
		borrowReturnHistories.add(borrowReturn3);
		borrowReturnHistories.add(borrowReturn4);
		borrowReturnHistories.add(borrowReturn5);
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public ArrayList<BookType> getBookTypes() {
		return bookTypes;
	}

	public ArrayList<Type> getTypes() {
		return types;
	}

	public ArrayList<BorrowReturnHistory> getBorrowReturnHistories() {
		return borrowReturnHistories;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	
	
}