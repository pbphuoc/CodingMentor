package day7;

public class MainDay7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStoreDataSource.loadDataSource();
		BookStoreService dataService = new BookStoreService();
		dataService.showBorrowListByAllCustomer();
	}
}
