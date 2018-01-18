public class RetailItem {
	private String description;
	private double price;

	
	
	public RetailItem(String description, double price) {
		setDescription(description);
		setPrice(price);
		
		
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
}