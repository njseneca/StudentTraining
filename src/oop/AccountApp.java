package oop;

public class AccountApp {

	public static void main(String[] args) {
	LoanAccount la = new LoanAccount();
	la.increaseRate();
	la.setRate();
	la.setAmortSchedule();
	la.setTerm(20);
	// polymorphism changes where we are pointing (points to the loan account)
	IRate account1 = new LoanAccount();
	account1.setRate();
	}

}
