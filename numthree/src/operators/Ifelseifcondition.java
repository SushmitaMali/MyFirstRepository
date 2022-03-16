package operators;

public class Ifelseifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int abc=10;
  //print the msg if less than 10
  //print the msg if number is greater than 10 but less thaan 20
  //print msg is number is greater than 20
  
   if (abc<=10) { 
   System.out.println("I am equal to or less than 10"); //less than 10
	} else  if (abc>10 && abc<20) {
		System.out.println("I am greater than 10 and less than 20");
	} // if greater than 10 and less than 20 if both conditions are true then only it is true
   // bcoz if we use && then both conditions are true then only ur o/p should true
	else  {
	System.out.println("I am greater than 20");
	}
	}
}
