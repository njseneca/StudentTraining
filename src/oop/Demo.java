package oop;

class Person {
	String name;
	String email; 
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "joe@gmail.com";
		person1.phone = "7038151183";
		
		person1.walk();
		person1.eat();
		person1.sleep();
		
		/*
		String name = "Joe";
		String email = "joe@gmail.com";
		String phone = "1038151183";
		
		System.out.println(name + " is walking");
		
		walking("Joe");
		walking("Sarah");
		
	}
	
	
	static void walking(String name) {
		System.out.println(name + " is walking");
	} 
	
	*/

}
}