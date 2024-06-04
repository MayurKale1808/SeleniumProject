package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
/*
 Test case
--------
1) Launch browser
2) open url
	https://opensource-demo.orangehrmlive.com/
3) Provide username  - Admin
4) Provide password  - admin123
5) Click on Login button
6) Verify the title of dashboard page
	Exp title : OrangeHRM
7) close browser

 */
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogintest {

	public static void main(String[] args) throws InterruptedException {

		// WebDriverManager.chromedriver().setup();
		// ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		/*
		 * WebElement textUsername=driver.findElement(By.name("username"));
		 * textUsername.sendKeys("Admin");
		 */
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin12");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		
		String act_text= null; //we can keep "" instead of null ,but have to remove "" from catch box as no need for assigning same"" for two times.
		
		try {
		 act_text = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		}
		catch(NoSuchElementException e){
			
				act_text="";
			
				}
			
		
		String exp_txt = "Dashboard";
		
		System.out.println(act_text);
		System.out.println(exp_txt);

		if (act_text.equals(exp_txt)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test Failed");

		}

		
/*		  String act_title = driver.getTitle(); String exp_title = "OrangeHRM";
		  
		  System.out.println(act_title);
		  System.out.println(exp_title);
		 
		  if (act_title.equals(exp_title))
		 
		  { System.out.println("Test is passed");
		 
		  } else { System.out.println("Test is failed");
		 
		  } */
		 

		Thread.sleep(2000);

		// driver.close();
		driver.quit();

	}

}




























