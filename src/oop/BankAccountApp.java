package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account
		
		BankAccount acc1 = new BankAccount();
		acc1.setName("Rooney");
		System.out.println(acc1.getName());
		acc1.accountNumber = "345412";
		System.out.println(acc1.toString());
		
		acc1.setRate();
		acc1.increaseRate();
		
		
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "345412";

		BankAccount acc3 = new BankAccount("Savings Account", 1500);
		acc3.accountNumber = "345412";
		
		acc3.checkBalance();

		// Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 5000;
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());

	}

}
