package day13;


final class Test1
{
	final void m()              // If we apply final keyword to the method that method can not be override in child class
	{
		System.out.println("This is m from Test1 class....");
	}
}



//class Test2 extends Test1    // incorrect as Test1 is a final class, so we can not extend Test1 into any sub class
//{
//	void m()   //error as m() is final method
//	{
//		System.out.println("This is fro Test2 class");
//	}
//	
//	
//	
//}




public class FinalMethodDemo {

	public static void main(String[] args) {
		

	}

}
