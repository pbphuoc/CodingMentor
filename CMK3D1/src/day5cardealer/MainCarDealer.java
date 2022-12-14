package day5cardealer;

public class MainCarDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car carCamry = new Car("Camry Atlise 2022", "Slow Speed", "Blue", 1.1, 250.0, 30000.0);
		Car carHonda = new Car("Honda Accord 2020", "Average Speed", "Black", 1.15, 265.5, 57650.0);
		Car carMercedes = new Car("Merc C200 2019", "Quite Fast", "Silver", 1.0, 280.0, 68000.0);
		OrderDetail detail1 = new OrderDetail(carCamry, 5);
		OrderDetail detail2 = new OrderDetail(carHonda, 3);
		OrderDetail detail3 = new OrderDetail(carMercedes, 10);
		Customer phuocPham = new Customer("customer1", "Phuoc Pham");
		Order order1 = new Order("order1", phuocPham, new OrderDetail[] { detail1 });
		Order order2 = new Order("order2", phuocPham, new OrderDetail[] { detail2, detail3 });
		Order[] orders = { order1, order2 };

		viewCustomerOrder(phuocPham, orders);
	}

	public static void viewCustomerOrder(Customer customer, Order[] orders) {
		Order selectedOrder;
		for (Order order : orders) {
			if (customer.getCustomerID().equalsIgnoreCase(order.getCustomer().getCustomerID())) {
				OrderDetail[] details = order.getOrderDetails();
				System.out.println(
						"OrderID: " + order.getOrderID() + " - Customer: " + order.getCustomer().getCustomerName());
				for (OrderDetail detail : details) {
					System.out.println("Item: " + detail.getItem().getName());
					System.out.println(
							"Description: " + detail.getItem().getColour() + " " + detail.getItem().getSpeed());
					System.out.println("Price: " + detail.getItem().getPrice());
					System.out.println("Quantity: " + detail.getQuantity());
				}
				System.out.println("--------------------------------------------------------");
			}
		}
	}

}
