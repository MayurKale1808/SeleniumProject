package Section5_3_TestNG_AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.*;

public class HardAssertion {
	
	
	@Test
	void test()
	{
//		Assert.assertEquals("xyz", "xyz");   //passed
//		
//		Assert.assertEquals(123, 123);       //passed
//		
//		
//		Assert.assertNotEquals(124, 567);		//passed
		
//		Assert.assertTrue(false);     // it will take boolean value
//		
//	Assert.assertTrue(1==2);	//comaprison will also give boolean value true or false
//	
	
	Assert.assertFalse(1==2);
	
	
	Assert.fail();                       //when we intentionally wan to fail the method
	
	
	
//these are hard assertion as we can directly access these methods from the assert class , no need to create 
//any object or anything......
//	These are all static methods thats why we can access them.
	
	
	
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
