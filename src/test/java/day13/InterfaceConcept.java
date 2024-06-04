package day13;


interface Shape
{
	int length = 10;
	int breadth=20;   //variables are by default Final and Static in interface

	
	void circle();   //abstract method - unimplemented
	
//	void square() 
//	{					// Interface doesn't allow other than default and static method which has implementation
//		
//	}
	
	default void square()
	{
		System.out.println("this is Square - default method");
		
	}
	
	
	static void rectangle()
	{
		System.out.println("This is rectangle - static method");
	}
}






public class InterfaceConcept implements Shape

{
	
	public void circle()
	{
		System.out.println("This is circle");
		
	}

	public static void main(String[] args) {
		
		
		InterfaceConcept obj = new InterfaceConcept();
		
		obj.circle();
		obj.square();			// we can't create object of interface so we have to create object of the class which
								// has implemented the interface and the access the method and variables from interface
	
		Shape.rectangle();    //as its a static method
		
//		Shape sh= new Shape();   ----this is not allowed , object of interface not allowed
									//--- but we can create reference variable of an interface

		
//--------------------------------------------------------------------------------------------------
		
		
		Shape sh = new InterfaceConcept();    //This is right - it means interface variable 'sh' can hold object of child class
												// which has implemented the interface
		sh.circle();
		sh.square();
		Shape.rectangle();
	}

	
}










