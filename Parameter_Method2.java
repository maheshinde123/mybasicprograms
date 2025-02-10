package methods;

public class Parameter_Method2 
{
	public static void main(String[] args) 
	{
	  cricketinfo("Virat",10000,5,'A',60.25f); //methodname();
	  cricketinfo("SuryaKumar",2000,2,'B',38.19f);//methodname();
	
	  //Step-I: Create Object of different class
	  Parameter_Method3 Z1=new Parameter_Method3(); //Classname objectname=new Classname();
	
	  //Step-II: Call the Method
	  Z1.School("Rohit", 3.2); //Objectname.methodname();
	}
	
	//Static regular method-->With Parameter method 
	public static void cricketinfo(String Playername, int Runs, int wkts, char Contractgrade, float Avgrun) 
	{
	   System.out.println(Playername); //Virat //SuryaKumar
	   System.out.println(Runs); //10000 //2000
	   System.out.println(wkts); //5 //2
	   System.out.println(Contractgrade); //A //B
	   System.out.println(Avgrun); //60.25 //38.19
	}

}
