package methods;

public class NonStatic1 
{
	//Non-Static regular method call from same Class
	public static void main(String[] args) 
	{
	  //Step-I: Create object/Instance of same class
		NonStatic1 S1=new NonStatic1();//Classname objectname=new Classname();
	  
	 //Steps-II: Call the method
	  S1.m1(); //Objectname.methodname();
	  S1.m2(); //Objectname.methodname(); 
	}
	
	//Non-Static regular method
	public void m1() 
	{
	  System.out.println("m1 non-Static regular method is running form same class");
	}
	
	//Non-Static regular method
	  public void m2() 
	{
	  System.out.println("m2 non-Static regular method is running form same class");
	}

}
