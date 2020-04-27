package oop;

public class BankAccount implements IRate{
	
	//static : belongs to the class not the object instance
	//final : makes it a constant

	//constructors are unique methods
	
	private String accountNumber;
	private static final String routingNumber = "28314";
	private String name;
	private String SSN;
	private String accountType;
	private double balance;
	
	BankAccount(){
		System.out.println("NEW ACCOUNT");
	}
	// overloading: call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	BankAccount(String accountType, double initialDeposit){
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT: " + initialDeposit);
		balance = initialDeposit;
	}
	public void setName(String nm) {
		name = nm;
	}
	public String getName() {
		return name;
	}
	public void deposit(double amt) {
		balance = balance + amt;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amt) {
		balance = balance - amt;
		showActivity("WITHDRAW");
	}
	private void showActivity(String act) {
		System.out.println("YOUR RECENT TRANSACTION: " + act);
		System.out.println("YOUR NEW BALANCE: " + balance);
	}
	void getBalance() {
		System.out.println("BALANCE IS: " + balance);
	}
	public void setRate() {
		
	}
	public void increaseRate() {
		
	}
	void getStatus() {
		
	}
	@Override
	public String toString() {
		return "[ " + name + ". " + accountType + ". BALANCE: $" + balance + " ]";
	}
	
}
