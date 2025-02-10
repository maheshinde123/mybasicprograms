package methods;

public class Static1 
{
	//Static Regular Method Call from same class
	
	public static void main(String[] args) 
	{
	   m1(); //methodname();
	   m2(); //methodname();
	}
	
	//Static Regular Method
	
	public static void m1() 
	{
	  System.out.println("m1 method is running from same class");
	}
	
	//Static Regular Method
	
	public static void m2() 
	{
	  System.out.println("m2 method is running from same class");
	}  

}
