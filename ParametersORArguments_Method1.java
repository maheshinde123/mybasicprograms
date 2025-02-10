package methods;

public class ParametersORArguments_Method1 
{
	public static void main(String[] args) 
	{
	 addition(); //methodname();
	 addition(40,50); //methodname();
	 addition(60,70); //methodname();
	 
	 //Step-I: Create object of same class
	 ParametersORArguments_Method1 S1=new ParametersORArguments_Method1(); //Classname objectname=new Classname();
	
	 //Step-II: Call the method
	 S1.multiplication(10,20,30); //Objcetname.methodname();
	 
	}

	//Static regular method-->Zero Parameter method
    public static void addition() 
	{
	  int a=10;
	  int b=20;
	  int sum1=a + b; //30
	  System.out.println(sum1); //30
	}
    
	//Static regular method--> 2 int parameter/arguments
	public static void addition(int c, int d) 
	{
	  int sum2 =c + d; 
	  System.out.println(sum2); 
	}
	
	//Non-Static regular method-->3 int parameter/arguments
	public void multiplication(int x, int y, int z) 
	{
	  int multi1=x*y*z; //6000
	  System.out.println(multi1); //6000
	}

}
