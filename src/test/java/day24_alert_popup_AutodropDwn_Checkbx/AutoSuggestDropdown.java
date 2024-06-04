package day24_alert_popup_AutodropDwn_Checkbx;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Selenium");
		
		Thread.sleep(3000);   /*here implicit wait will not work we have to take thread, as after typing
								Selenium in the search it will take some time to get all the options in the dropdown	
								*/
		
		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
		
		System.out.println(list.size());   /*Here we have to select span also as the main element will be at span
		 									tag location*/
		
		for(int i =0; i<list.size(); i++)   //to print all the dropdown options
		{
			System.out.println(list.get(i).getText());
		}
		
		for(int i =0; i<list.size(); i++)       //to click on one of the dropdown options
		{
			String txt=list.get(i).getText();
			
			if(txt.equals("selenium interview questions"))
			{
				list.get(i).click();
				break;                      /*We have to use break so that once i get accurate option clicked
				 								to get out of loop*/
			}
		}
		
		

	}

}
