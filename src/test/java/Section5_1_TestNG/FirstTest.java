package Section5_1_TestNG;

import org.testng.annotations.Test;

public class FirstTest {
  
	
	
	@Test(priority=1)
  public void A() {
		
		
		System.out.println("Test 1 is passed");
  }
	
	
	@Test(priority=2)
	public void C()
	{
		System.out.println("Test 3 is passed");
	}

	
	@Test
	public void B()
	{
		System.out.println("Test 2 is passed");
	}
	
	
	
}
// TestNG, By default execute the test cases in alphabetical order, so to control the execution
// we have to use the priority

//priority control the order of execution

//priority always a number, whicever the lowest number that will execute first

//e.g priority can be -2,-1,0,1,2   anything but it will start execution from lowest number only 
//in this case first will execute with priority -2

//if we give one test priority and another one no priority the tstNG will execute the alphabets wise first 
//and then go for priority





























