package facade_design_pattern;

public class Product {

	private String productName;
	private int productId;
	
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Product getProduct() {
		Product product = new Product();
		product.setProductName("Table");
		product.setProductId(1);
		return product;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productId=" + productId + "]";
	}

}
