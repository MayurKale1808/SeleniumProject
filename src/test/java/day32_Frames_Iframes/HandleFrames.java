package day32_Frames_Iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/* Frames/iframes
 * 
 * we handle frames using switchTo()
 * 
 * driver.switchTo().frame() ;     ---we have to pass the paramter in frame, if name/id attribute is present
 * 
 * driver.switchTo().frame(name);		we can directly give name/id itself as parameter without locator
 * 
 * 
 * sometimes name attribute is not present for frame then we have to consider entire frame as one web element
 * 
 * driver.switchTo().frame(WebElement);
 * 
 * 3rd one is by passing index it is only possible if you have one frame only,if multiple frames we can not find index which index belong to which frame
 * 
 * driver.switchTo().frame(index);
 * 
 */








public class HandleFrames {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");    //--https://testautomationpractice.blogspot.com
		
		driver.manage().window().maximize();

		
		
//----Frame using webElement----
//		We have to give web element as a paramaetr in frame()
		
		
//1st frame
		
		
		WebElement frm1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frm1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("hello");
		
		
//3rd frame---
		
		
		driver.switchTo().defaultContent();
		
		
		WebElement frm2=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(frm2);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("hello");
		
//Inner frame=-----
		
//here in 3rd frame there is only one iframe present so we can use index directly as other attributes are not present.
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector("div.AB7Lab")).click();
		
		driver.switchTo().defaultContent();    //- - -this will directly go to main page not to previous frame 3
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
