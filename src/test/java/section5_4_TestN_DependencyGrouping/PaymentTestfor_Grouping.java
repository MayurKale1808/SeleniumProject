package section5_4_TestN_DependencyGrouping;

import org.testng.annotations.Test;

public class PaymentTestfor_Grouping {

	
	
	@Test(priority=1, groups= {"sanity","regression"})
	void paymentinRupees()
	{
		System.out.println("payment in rupees");
	}
	
	
	
	@Test(priority=2, groups= {"sanity","regression"})
	void paymentinDollars()
	{
		
		System.out.println("payment in dollars");
	}
	
	
	
}
