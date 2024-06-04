package day10;

public class ConstructorDemo {   // constructor is use to assign the data into the variables.
	
	int x,y;
	String s;
	
//	ConstructorDemo()    //Default constructor
//	{
//		x=100;
//		y=200;
//		s="Welcome";
//	}
	
	ConstructorDemo(int a, int b, String str)  //Prameterized constructor we use it to change the constuctor data
	{											// in run time
		x=a;
		y=b;
		s=str;
	}
	
	
	
	
	
	
	void displayData() 
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}
	
	
	public static void main(String[] args) 
	{
//		ConstructorDemo cd = new ConstructorDemo();
		
		ConstructorDemo cd = new ConstructorDemo(10, 20, "Welcome");
		
		
		cd.displayData();
		
	}
	
	
	
	
	
	
	
	
	

}
