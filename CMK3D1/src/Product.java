
public class Product {
	private String productID;
	private String productName;
	private Constant.Category productCategory;
	private Brand productBrand;
	private double productPrice;
	private String productKeyword;

	public Product(String productID, String productName, Constant.Category productCategory, Brand productBrand,
			double productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productBrand = productBrand;
		this.productPrice = productPrice;
	}

	public String getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public Constant.Category getProductCategory() {
		return productCategory;
	}

	public Brand getProductBrand() {
		return productBrand;
	}

	public double getProductPrice() {
		return productPrice;
	}
}
