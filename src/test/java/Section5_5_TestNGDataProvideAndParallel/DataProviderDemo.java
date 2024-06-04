package Section5_5_TestNGDataProvideAndParallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProviderDemo {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(dataProvider="dp")                   //here dataProvider d' is small as its a parameter while is @Dataprovidr  the D' is Upper case as its an annotaion
	void testLogin(String email, String pwd) throws InterruptedException
	{																						//here in testLogin we have to provide two parameters as we are taking parameters from @DataProvider as emails and passwords				
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();												//so for each and every email id this script will execute multiple times
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status==true)
		{
		driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
		
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.close();
		
	}
	
	
	
	
	
	
	
	@DataProvider(name="dp", indices= {0,4})                        //we have to give some name to dataProvider so that test method 
										                            //should know which data provider we have to fetch as we can have multiple
	Object[][] loginData()													//dataProviders in code
	{
			Object data[][]= { {"abc@gmail.com", "test123"},
				 			{"qwe@gamil.com", "test234"},       //we can return the data of String type, or Integer
				 			{"poi@gmial.com", "123test"},     // or anything and we can also return data or store
				 			{"mnb@gmail.com", "jkh987"}			//data in array a mixed data so that why taking
				 											//return and variable type as Object here
		 					};							//we mostly use Excel file data only
														//sometimes we can use Excel file or Properties file
		 return data;
		 										//for API testing we can Use data from JASON or XML files
		 
	}					//***@DataProvider will always return Two Dimensional array only,
						//whether its n number of columns or rows
	
	
//	indices= {0,4}-------0th index and 4th index input it will take
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
