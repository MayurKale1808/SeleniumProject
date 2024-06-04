package day36_Handle_Mouse_Events;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHoverAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement login = driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
		
		WebElement myprofile=driver.findElement(By.xpath("//li[normalize-space()='My Profile']"));
			
		Actions act = new Actions(driver);
		
//		act.moveToElement(login).moveToElement(myprofile).click().build().perform();
		
		act.moveToElement(login).moveToElement(myprofile).click().perform();  //build id not mandatory
			
	}

}
