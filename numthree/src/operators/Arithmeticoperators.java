package operators;

public class Arithmeticoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Arithmeticoperators operations = new Arithmeticoperators();
	operations.add(2,3);
	operations.sub(10 , 5);
	operations.multiplication(5, 4);
	div(15, 3);
	modulus(10);
	
	}

 	public void add (int a, int b) {
	System.out.println("this is addition of two numbers " +(a + b));
   }
	public void sub (int a, int b) {
		System.out.println("this is substraction of two numbers " +(a - b));
	}
	public void multiplication (int a, int b) {
		System.out.println("this is multi of two numbers " + (a * b));
	}
	public static void div (int a, int b) {
		System.out.println("this is division of two numbers " + (a / b));
	}
	public static void modulus (int a) {
		System.out.println("modulus of any number is " + (a%2));
	}
}

