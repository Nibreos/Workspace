
import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingsAccount {

	class Savings {

		private double bal;
		private double iRate;
		private double finalAmountI;

		public Savings(double bal, double iRate) {
			finalAmountI = 0.0;
		}

		public void withdraw(double withdrawAmount) {
			bal -= withdrawAmount;
		}

		public void deposit(double depositAmount) {
			bal += depositAmount;
		}

		
		
		public void addInterest() {

			double monthlyiRate = iRate / 12;

			finalAmountI = monthlyiRate * bal;

			bal += finalAmountI;
		}

		public double getbal() {
			return bal;
		}

		public double getfinalAmountI() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	public double getfinalAmountI() {
		// TODO Auto-generated method stub
		return getfinalAmountI();
	}

	// public double getfinalAmountI() {
	// return

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print(" enter amount money currently in the account= ");
		double startingbal = keyboard.nextDouble();
		System.out.print("enter the anuall interest rate = ____ ");
		double iRate = keyboard.nextDouble();

		SavingsAccount SavingsAccount = new SavingsAccount();
		Savings Savings = SavingsAccount.new Savings(startingbal, iRate);

		System.out.print("number of months that have passed since the account was established = _____ ");
		double months = keyboard.nextInt();
		double montlyDeposit;
		double monthlyWithdrawl;
		

		DecimalFormat money = new DecimalFormat("###,###,##0.00");
			double interestEarned = 0.0;
				double totalDeposits = 0;
				double totalWithdrawn = 0;
				
			for (int i = 1; i <= months; i++) {

			System.out.print("  enter amount deposited for month= " + i + ": ");
			montlyDeposit = keyboard.nextDouble();
			totalDeposits += montlyDeposit;

			Savings.deposit(montlyDeposit);

			System.out.print(" enter amount withdrawn for ____ " + i + ": ");
			monthlyWithdrawl = keyboard.nextDouble();
			totalWithdrawn += monthlyWithdrawl;

			Savings.withdraw(monthlyWithdrawl);

			Savings.addInterest();

			interestEarned += Savings.getfinalAmountI();
		}

		System.out.println("running total deposited = $" + money.format(totalDeposits));
		System.out.println("running total withdrawn = $" + money.format(totalWithdrawn));
		System.out.println("interest earned = $" + money.format(interestEarned));
		System.out.println("Ending bal = $" + money.format(Savings.getbal()));
	}

}
