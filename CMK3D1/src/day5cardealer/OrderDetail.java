package day5cardealer;

public class OrderDetail {
	private Car item;
	private int quantity;

	public OrderDetail(Car item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	public Car getItem() {
		return item;
	}

	public int getQuantity() {
		return quantity;
	}
}
