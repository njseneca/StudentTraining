package StudentLab;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student("Nathan", "588467832");
		std1.pay(2000);
		std1.setPersonalInfo("703-815-1184", "Centreville", "Virginia");
		System.out.println(std1.toString());
	}

}
