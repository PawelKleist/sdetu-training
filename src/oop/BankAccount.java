package oop;

public class BankAccount implements IRate {
	//Define variables
	String accountNumber;
	static final String routingNumber = "06532";
	private String name;
	String SSN;
	String accountType;
	double balance = 0;
	
	//Constructor definitions
		//1. They are used to define / setup / initialize properties to an object
		//2. Constructors are IMPLICITLY called upon instantiation!
		// na polskie : kiedy inicjalizujemy nowa klase to normalnie dostaje ona puste wlasciwosci
		// dzieki constructorom nowa klasa bedzie miala od razu dopisane wartosci.
		//3. The same name as the class itself
		//4. Constructors have no return type at all
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	//Overloading: call same method name with different arguments
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		System.out.println("NEW ACCOUNT: " + accountType);
		String errorMsg = "";
		if(initDeposit < 1000) {
			errorMsg = "ERROR: Minimum deposit 1000 $";
		}
		else {
			errorMsg = "Thanks for your initial deposit $" + initDeposit;
		}
			System.out.println(errorMsg);
			balance = balance + initDeposit;
	}
	
	//Getters / Setters
	
	//Allow user to define the name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	//Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("INCREASING RATE");
		
	}
	
	//Define methods
	public void deposit() {
		
	}
	
	void withdraw() {
		
		
	}
	
	void checkBalance() {
		System.out.println("Balance: $" + balance);
		
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ " + name + ". " + accountNumber + ". BALANCE: $" + balance + " ]";
	}
}
