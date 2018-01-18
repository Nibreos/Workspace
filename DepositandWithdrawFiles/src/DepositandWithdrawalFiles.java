import java.io.IOException;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.util.Scanner;

import java.nio.file.Path;
import java.nio.file.Paths;

public class DepositandWithdrawalFiles {

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

	public static void main(String args[]) throws IOException {

		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the savings account's " + "annual interest rate: ");
		double interestRate = keyboard.nextDouble();

		DepositandWithdrawalFiles DepositandWithdrawFiles = new DepositandWithdrawalFiles();
		Savings Savings = DepositandWithdrawFiles.new Savings(500, interestRate);

		Path depositPath = Paths.get(" src\\Deposits.txt").toAbsolutePath();

		double totalDeposits = Files.lines(depositPath).mapToDouble(Double::valueOf).sum();

		Savings.deposit(totalDeposits);

		Path withdrawalsPath = Paths.get("src\\Withdrawals.txt").toAbsolutePath();

		double totalwithdrawals = Files.lines(withdrawalsPath).mapToDouble(Double::valueOf).sum();

		Savings.withdraw(totalwithdrawals);

		double priorBalance = Savings.getbal();

		Savings.addInterest();

		double interestEarned = Savings.getfinalAmountI();

		DecimalFormat money = new DecimalFormat("###,###,##0.00");

		System.out.println("Interest gained = $" + money.format(interestEarned));

		System.out.println("previous running balance = $" + money.format(priorBalance));

		System.out.println("total balance = $" + money.format(Savings.getbal()));

	}
}