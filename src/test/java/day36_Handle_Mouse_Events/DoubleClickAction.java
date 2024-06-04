package day36_Handle_Mouse_Events;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.manage().window().maximize();
		
//Swtich to frame
		
		WebElement frame1=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(frame1);  
		
		
		
//OR wsitvh to frame

//		as name and id both present for frame
		
//		driver.switchTo().frame("iframeResult");
				
				
		
		
		
		
		
		
		WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));						
		WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		
		//input[@id='field1']
		//input[@id='field2']
		//button[normalize-space()='Copy Text']
		
		
				
		
		
		field1.clear();          //clear text from field1
		
		field1.sendKeys("Welcome");
		
		//double click action on button
		
		Actions act = new Actions(driver);
												//it is giving NoSuchElement exception as the elements are located inside frame
		act.doubleClick(button).perform();
		
		
	//	String act_txt= field2.getText();
		
		String act_txt= field2.getAttribute("value");     // go and see discription below to see why we have taken 
														// getAttribute  instead of getText
		
		
		System.out.println("Actual Text is:"+ act_txt);         //--here we have to cross check
		
		
		if(act_txt.equals("Welcome"))
		{
			System.out.println("Test is passed");
		}
		
		else {
			System.out.println("Test is failed");
		}
		
		//As our test is failing as get text method is not able to get the value 
		//we can cross check that by orinting the txt we are getting from get text method
		//we are crosschecking by this method --System.out.println(act_txt);
		
		//*****We can only capture inner text using getText() method ----important point
		
		//but the 'hello World' in the text box previously is value of value attribute
		
		//so when we double click on copy button the  value of value attribute is getting copied into 
		//second field , so we can cross check by fetching the value of a value attribute for second field
		//
		//you can see the javascript given on that website on left side ...where value is getting assigned to the
		// value attribute after double clicking on copy button
		
		// ****So getAttribute("attribute")   - -- - method will return the value of respective attribute 
		
		// MOSTLY inner text will in    >Copy Text<    in this format on DOM.
		
		
		
		
		
		
		
		

	}

}
