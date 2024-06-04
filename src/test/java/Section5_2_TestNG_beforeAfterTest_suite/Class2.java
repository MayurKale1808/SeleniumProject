package Section5_2_TestNG_beforeAfterTest_suite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 {

	@Test
		void xyz()
		{
			
			System.out.println("xyz from class2");
		}
	
	@AfterTest
	void at()
	{
		System.out.println("This is afterTest Method");
	}
}
