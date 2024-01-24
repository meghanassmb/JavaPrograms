package encapulation;

public class Product {

	private int productId;
	private String ProductName;
	private double price;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setProductId(101);
		product.setProductName("Mobile");
		product.setPrice(25000);

		System.out.println("Product Id :" + product.getProductId());
		System.out.println("Product Name :" + product.getProductName());
		System.out.println("Product Price:" + product.getPrice());

	}

}
