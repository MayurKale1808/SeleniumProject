package section5_4_TestN_DependencyGrouping;

import org.testng.annotations.*;

public class LoginTestfor_Grouping {
	
	
	
	@Test(priority=1, groups={"sanity"})
	void loginByEmail()
	{
		System.out.println("Login by email");
	}
	


	
	
	@Test(priority=2, groups={"sanity"})
	void loginByFacebook()
	{
		
		System.out.println("login by facebook");
	}

	
	
	@Test(priority=3, groups={"sanity"})
	void loginBytwitter()
	{
		System.out.println("login by twitter");
		
	}
}
//in XML file we can group methods, we can execute specific group of
//methods from the classes using XML modifications
// in XML inside <include> we have to 
//mention which group we want to execute

//if we want to exeucte the methods
//which belong to both sanity and regression only the we have to
//give additional name to them


//groups= {"sanity","regression","functional"}
//
//then in XML
//
//<include name = "functional"/>
//
//this is how we can call those belong to sanity and regression













