package section5_4_TestN_DependencyGrouping;

import org.testng.Assert;
import org.testng.annotations.*;

public class DependencyMethods {
	
	
	@Test(priority=1)
	void openapp()
	{
		Assert.assertTrue(false);
	}
	
	
	
	
	
	@Test(priority=2, dependsOnMethods= {"openapp"})   //dependsOnMethod will execute the login method only if 
	void login()										//openapp app method get paased otherwise it will not
	{													//get executed
		Assert.assertTrue(true);
	}
	
	
	
	
	@Test(priority=3, dependsOnMethods= {"login"})
	void search ()
	{
		Assert.assertTrue(true);
	}
	
	
	
	
	
	@Test(priority=4, dependsOnMethods= {"login","search"})
	void advsearch()
	{
		Assert.assertTrue(true);
	}
	
	
	
	
	
	
	@Test(priority=5,dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}
	
	
	//in the above code we have written a normal code not a webdriver code, when we write webdriver code
//	there are dependent methods in that like if we are able to login then only we can get some elements from
	//home page
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
