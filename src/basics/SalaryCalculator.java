package basics;

public class SalaryCalculator {
		public static void main(String[] args) {
			String career;
			double rate = 42.50;
			int hoursPerWeek = 40;
			int weeksPerYear = 50;
				
			System.out.println("Program is starting");
			career = "Software Developer";
			System.out.println("My career is: " + career);
			double salary = rate * hoursPerWeek * weeksPerYear;
			System.out.println("My yearly salary is: $" + salary);
		}
	}


