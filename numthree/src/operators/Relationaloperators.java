package operators;

public class Relationaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Relationaloperators operationsnew = new Relationaloperators();
	operationsnew.greaterthan(10, 7);
	operationsnew.lessthan(18, 25);
	operationsnew.equalto(8, 4);
	operationsnew.greaterthanequalto(18, 19);
	operationsnew.lessthanequalto(25, 24);
	operationsnew.notequalto(15, 15);
}
 public void greaterthan(int a, int b) {
   System.out.println("is a greater than b?" +(a>b));
 }
 public void lessthan(int a, int b) {
	   System.out.println("is a less than b?" +(a<b));
}
 public void equalto(int a, int b) {
	   System.out.println("is a equalto b?" +(a==b));
}
 public void greaterthanequalto(int a, int c) {
	   System.out.println("is a greaterthanequalto c?" +(a>=c));
}
 public void lessthanequalto(int a, int c) {
	   System.out.println("is a lessthanequalto c?" +(a<=c));
}
 public void notequalto(int a, int c) {
	   System.out.println("a is not equl to c " +(a!=c));
 }
}