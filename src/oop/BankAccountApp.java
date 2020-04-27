package oop;

public class BankAccountApp {

	public static void main(String[] args) {

		BankAccount bka1 = new BankAccount("Checking Account");
		
		BankAccount bka2 = new BankAccount();
		bka2.name = "Nathan";
		bka2.accountType = "Savings";
		bka2.balance = 1000;
		BankAccount bka3 = new BankAccount("Savings Account", 1000);
		bka3.getBalance();
		System.out.println(bka2.toString());
		bka2.deposit(500);

		
		// demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.name = "Juan";
		cd1.accountType = "CD Accoount";
		System.out.println(cd1.toString());
		cd1.compound();
		
	

	}

}
