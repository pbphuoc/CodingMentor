import java.util.Scanner;

public class MainDay4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User userFrankPham = new User("FRANKPHAM", "frank$1234567", "Frank Pham", "frankpham@gmail.com");
		User userPhuocPham = new User("phuocpham", "phuoc^9876543", "Phuoc Pham", "phuocpham@gmail.com");
		User userCodingMentor = new User("codingMentor", "cm@9999999", "Coding Mentor", "codingmentor@gmail.com");
		User userCustomer = new User("ReGuLaRcUsToMeR", "regular*abcde", "Kevin De Bruyne", "KevinDeBruyne@gmail.com");
		User[] users = { userFrankPham, userPhuocPham, userCodingMentor, userCustomer };
		Product productGift = new Product("gift1", "Picture Frame 21", Constant.Category.GIFTWARE,
				new Brand("brand1", "SPLOSH", "ff.pbphuoc@gmail.com"), 29.95);
		Product productStationery = new Product("sta1", "Pencil Case Boy", Constant.Category.STATIONERY,
				new Brand("brand2", "staedtler", "abc@gmail.com"), 15.95);
		Product[] products = { productGift, productStationery };
		CartDetail cartDetail1 = new CartDetail(productGift, 10);
		CartDetail cartDetail2 = new CartDetail(productStationery, 20);
		CartDetail[] cartDetails = { cartDetail1, cartDetail2 };
		Cart cart1 = new Cart("cart1", cartDetails);
		Address address1 = new Address("123", "Freeman Road", "Inala", "QLD", "AU", "4077");
		PhoneNumber phone1 = new PhoneNumber("0412345678", Constant.PhoneNumberType.MOBILE);
		Scanner scanner = new Scanner(System.in);
		User user = null;
		System.out.println("Welcome to our Coding Mentor shop. Please enter your Username and Password to login:");
		while (user == null) {
			System.out.print("Username: ");
			String username = scanner.nextLine();
			System.out.print("Password: ");
			String password = scanner.nextLine();
			user = authenticateUser(users, username, password);
			if (user == null) {
				System.out.println("Incorrect Username or Password. Please try again");
			} else {
				System.out.println("Login succesfully!");
				boolean inMenu = true;
				while (inMenu) {
					System.out.println("Welcome back " + user.getFullName() + "!");
					System.out.println("Enter a number to choose from the following menu");
					System.out.println("1 Check products to buy");
					System.out.println("2 Check your current Cart");
					System.out.println("3 Check your Order History");
					System.out.println("4 Log out");
					Integer option = Integer.parseInt(scanner.nextLine());
					switch (option) {
					case 1:
						for (int i = 0; i <  products.length; i++) {
							System.out.println((i+1) + " " + products[i].getProductName() + " $" + products[i].getProductPrice());
						}
						System.out.println("Enter the product number you want to buy or enter 0 to go back to Main Menu");
						Integer productNumber = Integer.parseInt(scanner.nextLine());
						if(productNumber == 0) {
							break;
						}else if (productNumber <= products.length) {
							System.out.println("How many item do you want to buy?");
							Integer productQuantity = Integer.parseInt(scanner.nextLine());
							System.out.println("So you are going to buy: " + productQuantity + products[productNumber-1].getProductName());
						}
						else {
							System.out.println("Wrong Input please try again!");
						}
						
						break;
					case 2:
						for (CartDetail cartDetail : cart1.getCartDetails()) {
							String name = cartDetail.getProduct().getProductName();
							int quantity = cartDetail.getQuantity();
							System.out.println(quantity + " x " + name + " = $" + cartDetail.getSubtotal());
						}
						System.out.println("Total: " + cart1.getTotal());
						break;
					case 3:
						Cart cart2 = new Cart("cart2", new CartDetail[] { cartDetail1 });
						Billing billing1 = new Billing(cart2, user);
						Shipping shipping1 = new Shipping("shipping1", "phuoc pham", address1, phone1);
						Payment payment1 = new Payment(Constant.PaymentType.CREDITCARD, cart2.getTotal(), address1);
						Order order = new Order("order1", billing1, shipping1, payment1);
						System.out.println("Order Date: " + order.getOrderDate());
						for (CartDetail cartDetail : order.getBilling().getCart().getCartDetails()) {
							System.out.println("Item: " + cartDetail.getProduct().getProductName() + " | Price: $"
									+ cartDetail.getProduct().getProductPrice() + " | Quantity: "
									+ cartDetail.getQuantity() + " | Sub Total: $" + cartDetail.getSubtotal());
						}
						System.out.println("Total: $" + order.getBilling().getCart().getTotal());
						System.out.println("Shipping fee: $" + order.getShipping().getShippingFee());
						System.out.println("Order Status: " + order.getOrderStatus());
						break;
					case 4:
						inMenu = false;
						break;
					default:
						System.out.println("Wrong input. Please try again");
						break;
					}
				}
				System.out.println("Logout successfully");
			}
		}
		scanner.close();
	}

	public static User authenticateUser(User[] users, String username, String password) {
		for (User user : users) {
			if (username.toLowerCase().equals(user.getID())) {
				if (password.equals(user.getPassword()))
					return user;
				else
					return null;
			}
		}
		return null;
	}
}
