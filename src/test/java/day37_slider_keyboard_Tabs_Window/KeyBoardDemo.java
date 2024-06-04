package day37_slider_keyboard_Tabs_Window;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://text-compare.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//textarea[@name='text1']")).sendKeys("Welcome");
		
		
		Actions act = new Actions(driver);
		
		
		//ctrl+A    =select the text
		
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		
		
		//ctrl+C	=copy the text
		
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		
		
		//tab		=move to next text area
		
		act.keyUp(Keys.TAB).keyDown(Keys.TAB).perform();
		
		
		//ctrl+v   = paste the text
		
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
//Example for three keys
		
//		Ex:  ctrl + shift + A
		
		
//		act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
//		
//		
//		keys - is inbuilt class in slenium
//		
//		if we are pressing for keydown in (ctrl + shift + A) sequence 
//		then for key up we have to follow reverse sequence  (shift + ctrl) like in above example
//		
		
		
		
//		Ex: ENTER
//		
//		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
