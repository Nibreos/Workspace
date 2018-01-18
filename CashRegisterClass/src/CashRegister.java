public class CashRegister {
	double TaxRate = 0.06;

	RetailItem item;
	int quantity;

	CashRegister(RetailItem item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	public double getTax() {
		return item.getPrice() * TaxRate;
	}

	public double getTotal() {
		return getSubtotal() + getTax();
	}

	public double getSubtotal() {
		return item.getPrice() * quantity;
	}
}