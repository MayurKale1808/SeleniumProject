package Section5_2_TestNG_beforeAfterTest_suite;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {

	
	@Test
	void abc()
	{
		System.out.println("abc from class1");
	}
	
	
	@BeforeTest
	void bt()
	{
		System.out.println("This is BeforeTest Method");
	}
	
	
}









//if we want to execute multiple classes together with 
//the help of XML file 







//we have to execute these two classes through
//XML file as for Before/after Test we 
//have to apply on Test level which contains multiple classes





//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//
//
//
//
//<suite name="Suite">
//
//	<test  name="Test">
//    <classes>
//      <class name="Section5_2_TestNG_beforeAfterTest.Class2"/>
//      <class name="Section5_2_TestNG_beforeAfterTest.Class1"/>
//    </classes>
//    
//    
//  </test> <!-- Test -->
//</suite> <!-- Suite -->





//the above XML file contain one Test 

//so if we have only one class  in the XML test, the @BeforeTest
//@AfterTest ....will execute only once before and after class in xml as per the XML file


//if we have more than one class in test XML, then before/after 
//test will execute as 
//per the number of classes present in test xml/ or two times...
//we have confusion clear that point************************



//we can have before test or after test in any class in same package
//it will execute.

//the difference betweem before/after class
//and before/after test is that in before/after class 
//we can only work in a same class
//while before/after test we can work on multiple classes through XML












