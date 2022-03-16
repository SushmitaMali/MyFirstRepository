package operators;

public class Unaryoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Unaryoperators operations = new Unaryoperators();
		 operations.positive(5);//positive + positive is alwys positive
         operations.negative(10);//here o/p
         operations.increment(22); //in o/p value incresed by one i.e 22+1
         operations.decrement(30);//in o/p value decresed by one i.e 30-1
	     operations.Boolean(true);
	}
 private void positive (int a) {
	 System.out.println("I am operator to represent positive "+(+a));
 }
 private void negative (int b) {
	 System.out.println("I am operator to represent negative "+(-b));
}
 private void increment (int c) {
	 System.out.println("value increment by one " + (++c));
 }
 private void decrement (int d) {
	 System.out.println("value decrement by one " + (--d));
 }
 private void Boolean (boolean e) {
	 System.out.println("i am represent boolean i n reverse "+ (!e));
}
}
