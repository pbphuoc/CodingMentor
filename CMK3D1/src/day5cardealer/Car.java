package day5cardealer;

public class Car {
	private String name;
	private String speed;
	private String colour;
	private double height;
	private double weight;
	private double price;

	public Car(String name, String speed, String colour, double height, double weight, double price) {
		this.name = name;
		this.speed = speed;
		this.colour = colour;
		this.weight = weight;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getSpeed() {
		return speed;
	}

	public String getColour() {
		return colour;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public double getPrice() {
		return price;
	}

}
