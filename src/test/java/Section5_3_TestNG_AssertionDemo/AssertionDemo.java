package Section5_3_TestNG_AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.*;

public class AssertionDemo {
	
	
	
								//in TestNG we follow certain naming convention  method name should be 
	@Test							//start with 'test' , like here 'testTitle()'
	void testTitle()
	{
		String exp_title = "Opencart";
		
		String act_title = "Openshop";      //here if we try with different i/p string data we will get out put
											//failed but the test method - testtitle() will show passed
											//even if conditional statement in methods are failed but still
											//it shows method to be passed...this is the problem in conditional
											//statement validation...thats why to overcome we use assertions
												
											
	/*	if(exp_title.equals(act_title))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		} */
											
		
		
		
		Assert.assertEquals(exp_title, act_title);  //Assert is predefined class in TestNG
		
	}												//if these two are equals aeesrt will make tesTitle() passed
													// otherwise failed it

}
