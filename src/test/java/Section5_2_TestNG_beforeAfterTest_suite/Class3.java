package Section5_2_TestNG_beforeAfterTest_suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class3 {
	
	@Test
	void pqr()
	{
		System.out.println("this is pqr from class3");
	}
	
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This is before Suite");
	}
	
	
	@AfterSuite
	void as()
	{
		System.out.println("This is after Suite");
	}
	
	
}























