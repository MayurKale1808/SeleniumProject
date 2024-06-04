package day24_alert_popup_AutodropDwn_Checkbx;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/* Alert is not a Web element so we have to click on it using switch() methods as we can no 
 * locate it like a web element so we can only move to alert window using switch().
 * 
 * 
 * 
*/


public class HandleAlertsDemo {

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			
			WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
			
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
			
	/*		Alert alertWindow=driver.switchTo().alert();   /*-so .alert() will return the alert  window so 
																its return type will be
											                   alert type*/
			
	 
//			driver.switchTo().alert().accept();   		 // If we want to close alert window here itself we can do 
														 //	with like this
			 											 //<----			
//			driver.switchTo().alert().dismiss();											     
			
			
			
			
//---sometimes alert window take time to come so we have to use explicit wait as implicit wait sometimes not useful		
			
			Alert alertWindow=mywait.until(ExpectedConditions.alertIsPresent());  /*this mywait.until()
																					will wait for alert window to appear
																					once it appear it will take return
																					the alert window into alertWindow 
																					variable*/
			
			System.out.println(alertWindow.getText());
		
			
			
	
			
			
	//		alertWindow.accept();      //this will close alert window using OK button
			
			alertWindow.dismiss();      //this will close alert window using CLOSE button
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
