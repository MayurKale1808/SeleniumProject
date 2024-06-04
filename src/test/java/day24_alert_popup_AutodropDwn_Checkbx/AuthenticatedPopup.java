package day24_alert_popup_AutodropDwn_Checkbx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticatedPopup {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
	//	driver.get("https://the-internet.herokuapp.com/basic_auth");  // as soon as we click on this link the 
																	 // the poup for authentication will appear 
									                                 // so there is no need to click anywhere
			
		
/* In this kind of popup we can not use switch() as it is a different type of popup
 * 
 * to bypass that popup we have to send username and password along with the URL of that website		
 *
 *
 *There is a special syntax to pass the username and password 
 *
 *      in the place of URL we have to pass
 *      
 *    SYNTAX  -		url = “https://” + username + “:” + password + “@” + domain;
 *
 *		eg here, 	driver.get("https://the-internet.herokuapp.com/basic_auth")
 *					driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth")
 *
 *
 */			
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.manage().window().maximize();
		
		String txt = driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		
		if(txt.contains("Congratulations!"))
		{
			System.out.println("Successful login");
		}
		else
		{
			System.out.println("Login failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
