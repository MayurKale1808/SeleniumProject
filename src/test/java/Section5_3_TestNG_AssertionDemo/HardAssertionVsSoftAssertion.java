package Section5_3_TestNG_AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class HardAssertionVsSoftAssertion {
	
		
	@Test
	void test_hardAssertions()
	{
		
		System.out.println("testing.....hard assertion");
		System.out.println("testing.....hard assertion");
		
		Assert.assertEquals(1, 2);                       //if this assertion is failed the remaining statement will not get 
										                    // executed in the hard assertion
		
												             //so in 90% TestNg we put hard assertion in the last statement
		System.out.println("testing.....hard assertion");     // normally also we do the validation in the last
		System.out.println("testing.....hard assertion");
		
		
//so when ever we want to execute some statements after the assertion , in 1% of the cases 
//		we use the soft assertion
		
		

	}
	

	
	

//In soft assertion we don't directly access these methods from the assert class
	//methods are same but we have to access those from the object
	
	
	
	@Test
	void test_softAssertion()
	{
		System.out.println("testing.....soft assertion");
		System.out.println("testing.....soft assertion");
		
		
		SoftAssert sa = new SoftAssert();      //soft assertion
												
		sa.assertEquals(1, 2);        //soft assertion should fail but execute all the remaining statements
									//but it will also show soft assertion pass 
									//to avoid that we have to use sa.assertAll(); at the end of the statements
		
		System.out.println("testing.....soft assertion");
		System.out.println("testing.....soft assertion");
		
		sa.assertAll();       //Mandatory
		
//in soft assert the methods are not static so we need to create an object	

//		while in hard assert we don't need to create object as the methods are static
		
		
//so soft assertion is even though our soft assertion got failed it should execute the remaining statements
		
			
		
	}
	
//we can not create object of soft assert outside the mothod
//
//as we always create object of any class inside the main method normally but here in testNg we 
//don't have main method so we have to compulsary create object of any class inside any mehtod but only
//in the method, that method could be any method
// we can create variable you can create at class level like , SoftAssert sa;
//	and can access that in different methods
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
