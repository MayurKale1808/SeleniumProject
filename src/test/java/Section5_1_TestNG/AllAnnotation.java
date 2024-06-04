package Section5_1_TestNG;

import org.testng.annotations.*;

public class AllAnnotation {
	
	
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This is Before Suite");
	}
	
	@AfterSuite
	void as()
	{
		
		System.out.println("This is After Suite");
	}
	
	@BeforeTest
	void bt()
	{
		
		System.out.println("This is Before Tset");
	}
	
	@AfterTest
	void at()
	{
		
		System.out.println("This is After Test");
	}
	
	
	@BeforeClass
	void bc()
	{
		
		System.out.println("This is Before Class");
	}
	
	@AfterClass
	void ac()
	{
		
		System.out.println("This is After Class");
	}
	
	@BeforeMethod
	void bm()
	{
		
		System.out.println("This is Before Metho");
	}
	
	@AfterMethod
	void am()
	{
		System.out.println("This is After Method");
		
	}
	
	@Test(priority=1)
	void tm1()
	{
		
		System.out.println("This is test Method 1");
	}
	
	@Test(priority=2)
	void tm2()
	{
		
		System.out.println("This is Btest Method 2");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
