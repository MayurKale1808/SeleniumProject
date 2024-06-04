package day24_alert_popup_AutodropDwn_Checkbx;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

//---------Select specific checkbox

//		driver.findElement(By.xpath("//input[@id='sunday']")).click();

//-------- select all the check boxes ---this is also right syntax ---//input[@class='form-check-input'][ @type='checkbox']

		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

		System.out.println("Total number of Checkboxes" + checkboxes.size());

//		select all the checkboxes

//		for(int i=0; i<checkboxes.size(); i++) //  i<checkboxes.size()--bcz size count starts with '0', size() bcz List is a collection
//		{
//			checkboxes.get(i).click();  // here we are using 'get' method to fetch the checkbox at a time, because its List not array, in aaray we use [i]
//		}								//.get() --method will get each box at a time and click() will click on it
//		

//		 Enhanced for loop

		/*
		 * for( WebElement chkbox : checkboxes) 
		 * { 
		 * 		chkbox.click(); 
		 * }
		 */

		/*
		 * If we have to select last two or three check boxes, we have to use normal for
		 * loop as indices are important in this case .
		 * 
		 * (TOTAL NUMBER OF CHECKBOXES - HOW MANY BOXES WE WANT TO SLELECT = STARTING
		 * INDEX) 7 - 2 = 5 ..so '5' will be starting index
		 */

//		for(int i=5; i<checkboxes.size();i++)
//		
//		{
//			checkboxes.get(i).click();
//		}

		/* If we have to select first two check boxes */

//		for(int i=0; i<2;i++) 
//		{
//			checkboxes.get(i).click();
//			
//		}

		/*-----------OR for above logic--------*/

		/*
		 * for(int i=0; i<checkboxes.size();i++)
		 * 
		 * {
		 * 
		 * 			if(i<2) 
		 * 			{ 
		 * 				checkboxes.get(i).click(); 
		 * 			} 
		 * }
		 */

		/*---------For unselecting/uncheck/clear all the check boxes, just repeat the click action one more time --------*/

		/*for(int i=0;i<checkboxes.size(); i++) 
		{
			checkboxes.get(i).click();
		}
		
		for(int i=0;i<checkboxes.size(); i++) 
		{
			checkboxes.get(i).click();
		}*/
		
		
		/*-------If we select first three boxes and have to unselect it-------------*/
		
		for(int i=0;i<3; i++) 
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(2000);
		
		
		/*
		 * for(int i=0;i<checkboxes.size(); i++) 
		 * {
		 * 
		 * 			if(checkboxes.get(i).isSelected()) 
		 * 			{ 
		 * 				checkboxes.get(i).click(); 
		 * 			} 
		 * }
		 */
		
		/*--------OR-----*/
		
		for( WebElement chkbox:checkboxes) 
		{
			if(chkbox.isSelected())
			{
				chkbox.click();
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
