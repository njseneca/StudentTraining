package StudentLab;

import java.util.Scanner;

public class Student {
private String name;
private String SSN;
private String email;
private static String ID = "4892";
private double balance;
private String courses = "";
private String phone = "not entered";
private String city = "not entered";
private String state = "not entered";
private String userID;


	public Student(String nm, String sn) {
		name = nm;
		SSN = sn;
		createEmail();
		setID();
		enroll();
		
	}
	private void createEmail() {
		email = name + "@school.edu";
	
	}
	private void setID() {
		boolean follow = true;
		int random = (int)(Math.random() * 10000);
		int ext = 0;
		while(follow) {
		if(random < 9000 && random > 1000) {
			ext = random;
			follow = false;
		}
		else {
			follow = true;
		}
		}
		userID = ID + ext + SSN.substring(5,9);
		
	}
	public void enroll() {
		double MoneyOwed = 0;
		String classes = "";
		System.out.print("Enter number of classes enrolling in: ");
		Scanner in = new Scanner(System.in);
		int numOfClasses = in.nextInt();
		for(int i= 0; i<numOfClasses; i++) {
			System.out.print("Enter class name: ");
			Scanner newClasses = new Scanner(System.in);
			classes = classes +"\n" + newClasses.next();
			MoneyOwed = MoneyOwed + 500;
		}
		balance = balance - MoneyOwed;
		courses = courses + classes;
		System.out.println("Enrolled in: " + classes);
		System.out.println("Cost: " + MoneyOwed);
		System.out.println("Balance: " + balance);
	}
	public void pay(double amt) {
	balance = balance + amt;
	checkBalance();
	}
	public void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	public void showCourses() {
		System.out.println("Courses enrolled in: "+ courses);
	}
	@Override
	public String toString() {
		return( "Name: " + name +
				"\nEmail " + email +
				"\nUser ID: " + userID +
				"\nPhone Number: " + phone + ", City: " + city + ", State: " + state);
	}
	public void setPersonalInfo(String num, String ci, String sta) {
		phone = num;
		city = ci;
		state = sta;
	}
	
}
