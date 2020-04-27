package basics;

public class assignment1 {

	public static void main(String[] args) {
		System.out.println("Sum: " + sum(8));
				
System.out.println("Factorial: " + factorial(4));
System.out.println("*********");
int[] test = {5, 9, 3, 4};
System.out.println("Max: " +max(test));
System.out.println("Min: " + min(test));
System.out.println("Average: " + average(test));


	}
	
	public static int sum(int n) {
		int sum = 0;
		for(int i = 0; i<=n; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static int factorial(int n) {
		if(n == 2) {
			return 2;
		}
		else if(n == 1) {
			return 1;
		}
		return (n*(factorial(n-1)));
	}
	
	public static int max(int[] a) {
		int x = a[0];
		for(int i = 0; i < a.length; i++) {
			if(x < a[i]) {
			x = a[i];
			}
		}
		return x;
		
	}
	
public static double average(int[] a) {
	int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		double average = sum/a.length;
		return average;
	}

public static int min(int[] a) {
	int x = a[0];
	for(int i = 0; i < a.length; i++) {
		if(x > a[i]) {
		x = a[i];
		}
	}
	return x;
}

	
	

}
