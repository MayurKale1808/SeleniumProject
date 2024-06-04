package section5_4_TestN_DependencyGrouping;

import org.testng.annotations.*;

public class SignupTestfor_Grouping {

	
	
	@Test(priority=1, groups= {"regression"})
	void signupByEmail()
	{
		System.out.println("signup by email");
	}
	
	
	
	
	@Test(priority=2, groups= {"regression"})
	void signupByFacebook()
	{
		
		System.out.println("signup by facebook");
	}

	
	
	@Test(priority=3, groups= {"regression"})
	void signupBytwitter()
	{
		System.out.println("signup by twitter");
		
	}
		
	
	
	
}
