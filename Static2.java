package methods;

public class Static2 
{
	// Static Regular Method Call from different class
	
	public static void main(String[] args) 
	{
	   Static3.m3(); //Classname.methodname();
	}
}

/* If you want to call static regular method from same class then use :      methodname();
   If you want to call static regular method from different class then use : Classname.methodname(); */