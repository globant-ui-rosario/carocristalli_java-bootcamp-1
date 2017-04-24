package Topic1;

public class Item {
	
	private int quantity;
	private String productName;
	private double unitPrice;
	
	public Item(int quantity, String product, double unitPrice) {
		this.quantity = quantity;
		this.productName = product;
		this.unitPrice = unitPrice;		
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	

}
