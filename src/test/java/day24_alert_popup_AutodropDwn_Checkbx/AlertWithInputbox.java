package day24_alert_popup_AutodropDwn_Checkbx;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWithInputbox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click(); /*alert window appear when we
																				click on this jsprompt button
																					*/
		Alert alertWindow=driver.switchTo().alert();
		
		
		
		System.out.println(alertWindow.getText());
		
	/*	alertWindow.sendKeys("Welcome");
		
		alertWindow.accept();
		
		String act_txt = driver.findElement(By.xpath("(//p[@id='result'])[1]")).getText();
		
		String exp_txt = "You entered: Welcome";
		
		if(act_txt.equals(exp_txt))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
