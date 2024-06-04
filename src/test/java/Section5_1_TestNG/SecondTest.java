package Section5_1_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest {
  
	WebDriver driver;
	
	@Test(priority=1)
	public void openApp() 
  {
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
  
  }
  
	@Test(priority=2)
  public void login()
  {
	  driver.findElement(By.name("username")).sendKeys("admin");    
	  
	  
	//here we can not directly take driver instant
    //as WebDriver driver we have created in openApp() method
    //so its a local variable for openApp() method so we can not
    //use it in another method so we have to initialize 
    //driver variable of WebDriver type at class level
	  
	  
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
  }
  
	@Test(priority=3)
  public void closeApp() 
  {
		
	  driver.close();
	  
  }
  
  
}
