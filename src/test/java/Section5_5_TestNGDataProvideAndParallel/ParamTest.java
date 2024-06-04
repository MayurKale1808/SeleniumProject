package Section5_5_TestNGDataProvideAndParallel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ParamTest {
	
	WebDriver driver;

	
	
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	
	@Test(priority=1)
	void testLogo()
	{
		
		
	}
	
	@Test(priority=2)
	void testTitle()
	{
		
		
	}
	
	
	@Test(priority=3)
	void testUrl()
	{
		
	}
	
	
	@AfterClass
	void tearDown()
	{
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
