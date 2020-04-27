package basics;

public class numbersCalc {

		public static void main(String[] args) {
			printName();
			
			int numa = 10;
			int numb = 20;
			addNumbers(numa,numb);
			int product = multiplyNumbers(numa, numb);
			System.out.println(product);

		}
	static void printName(){
	System.out.println("My name is Nathan");
}

	static void addNumbers(int numbera, int numberb){
	int sum = numbera + numberb;
	System.out.println(sum);
}
	static int multiplyNumbers(int numbera , int numberb){
	int product = numbera * numberb;
	addNumbers(product, product);
	return product;
}
}

