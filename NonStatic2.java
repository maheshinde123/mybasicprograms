package methods;

public class NonStatic2 
{
	//Non-Static regular method call from different class
	public static void main(String[] args) 
	{
	   //Step-I: Create object of a different class
		NonStatic3 S2=new NonStatic3(); //Classname objectname=new Classname();
	
	   //Step-II: Call the method
	   S2.m3(); //Objectname.methodname();
	   S2.m4(); //Objectname.methodname();
	   
	}

}
