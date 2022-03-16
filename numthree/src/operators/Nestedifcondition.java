package operators;

public class Nestedifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int age = 25;
 int weight = 55;
	if (age>=18) 
	{
		if (weight >50) 
		{
		  System.out.println("You can donate blood");
	  	}
		else 
		{
		  System.out.println("You are under weight");
		} 
	} 
	else
		{
		  System.out.println("Your age is below 18");
		}
	}
}

