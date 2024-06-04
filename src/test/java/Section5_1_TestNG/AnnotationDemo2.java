package Section5_1_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo2 {
	
	
	@BeforeClass
	void login()
	{
		System.out.println("Login");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("Search");
		
	}
	
	@Test(priority=2)
	void advancedSearch()
	{
		System.out.println("Advanced Search");
		
	}
	
	
	@AfterClass
	void logout()
	{
		System.out.println("Logout.....");
	}
	
	
//	@BeforeClass and @AfterClass will run only once before all the @Test and after all the @Test execution resp.
	
	
	
	

}
