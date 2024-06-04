package day36_Handle_Mouse_Events;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		
		Actions act = new Actions(driver);
		
		act.contextClick(button).perform();     //Right click action
		
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		
		
		
//		WebElement cpybutton=driver.findElement(By.xpath("//span[normalize-space()='Copy']"));
//		
//		act.moveToElement(cpybutton).click().perform();                                        //this was my logic
		
		
		
		driver.switchTo().alert().accept();
		
		
		
		

	}

}
