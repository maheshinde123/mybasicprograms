package methods;

public class NonStatic4 {
	public static void main(String[] args) 
	{
	 //Type-I: Static regular method call from same class
	 m12(); //methodname();
	 
	 //Type-II: Non-Static regular method call from same class
	 //Step-I: Create object of same class
	 NonStatic4 S3=new NonStatic4();//Classname objectname=new Classname();
	
	 //Step-II: Call the method
	 S3.m13(); //Objectname.methodname();
	 
	 //Type-III: Static regular method call from different class
	 NonStatic5.m14(); //Classname.methodname();
	
	 //Type-IV: Non-Static regular method call from different class 
	 //Step-I: Create object of different class 
	 NonStatic5 S4=new NonStatic5();//Classname objectname=new Classname();
	
	 //Step-II: Call the method
	 S4.m15(); //Objectname.methodname()
	
	//Static regular method
	}
	public static void m12() 
	{
	  System.out.println("m12 method is running from same class");
	}
	
	//Non-Static regular method
	public void m13() 
	{
	  System.out.println("m13 method is running from same class");
	}
	

}
