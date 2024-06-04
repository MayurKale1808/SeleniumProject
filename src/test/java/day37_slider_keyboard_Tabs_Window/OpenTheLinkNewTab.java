package day37_slider_keyboard_Tabs_Window;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkNewTab {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		   WebElement registerLink = driver.findElement(By.xpath("//a[@class='ico-register']"));
		
		   Actions act = new Actions(driver);
		   
		   
		   
//		   act.keyDown(Keys.CONTROL).perform();
//		
//		   registerLink.click();					<--------my logic
//		   														
//		   act.keyUp(Keys.CONTROL).perform();
		   
		   
		   act.keyDown(Keys.CONTROL).click(registerLink).keyUp(Keys.CONTROL).perform();   //CTRL+RegisterLink
		   
//Normally we dont give parameter inside click method as that was are accessing  from WebElement 
// but here we are using it from keysDown as from actions class so we can parameterize it.
		   
//		   But still after clicking on the register link new tab is getting opened but our driver is 
//		   still focused on the homepage.
		   
		/*   Now to go to the registration tab we have to use switching Command     */
		   
		   
	//----Switching to registration page---as two browser tabs are open
		   
//		   so first we have to take the window ids of the both tabs
		   
		   
		   
		   
		   
	/*	-----**    Set<String> ids = driver.getWindowHandles();   **----  */
		   
		   
		   
		   
		   
		   
//we have two tabs so the index of two windows will be 0 and 1
		       
//so the parent index will be 0 and child the new tab index will be 1
		       
//but Set collection doesn't have index concept so get() method is not there.....
//		       so first we have to convert it into Array List collection then we can extract by using index
		       
		       
		       
		       List<String> ids = new ArrayList(driver.getWindowHandles());
		        

//	what we have done in above line	       
		       
//	driver.getWindowHandles() - -- this will return the set collection that we are passing into ArrayList
		       
//		       once it passed into arrayList that will return the List collection so now we can get index
		       
		      
		       
//		       ids.get(1);         //here we want second tab so 1 index as prameter as index starts from 0
		       
		       
		       
		       driver.switchTo().window(ids.get(1));     //this will switch to registration page
		       												//now we can handle elements from registration page
		       
		       
		       
 //now we can handle elements from registration page		       
		       
		       
		       driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Mayur Kale");
		       
		       
//	Get back to home page
		       
		       driver.switchTo().window(ids.get(0));    //switch to home page
		       
		       
		       driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Tshirts");
		       
		       
		       
//from Selenium 4 onwards they have introduced new command go to next class new tabs and window commands


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
