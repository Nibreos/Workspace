import java.util.Scanner;
import java.text.DecimalFormat;


public class CashRegisterDemo {
	
	public static void main(String[] args) {
		
		RetailItem item;
		CashRegister cashRegister;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat money = new DecimalFormat("###,###.00");

		String itemDescription;
		int quantity;
		double itemPrice;
		// TODO Auto-generated method stub
		

		System.out.print("give it a brief description _____  ");
		itemDescription = keyboard.nextLine();

		System.out.print("put in the price $________ ");
		itemPrice = keyboard.nextDouble();

		item = new RetailItem(itemDescription, itemPrice);

		System.out.print(" type how many items ______  ");
		quantity = keyboard.nextInt();

		cashRegister = new CashRegister(item, quantity);

		
		
		System.out.println("\nSubtotal: $" + money.format(cashRegister.getSubtotal()));
		System.out.println("Sales tax: $" + money.format(cashRegister.getTax()));
		System.out.println("Total: $" + money.format(cashRegister.getTotal()));
	}
}