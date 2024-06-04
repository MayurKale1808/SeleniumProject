package day24_alert_popup_AutodropDwn_Checkbx;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownWithSelectTag {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");

		driver.manage().window().maximize();

		

		WebElement DrpcountryEle = driver.findElement(By.xpath("//select[@id='country-list']"));
		
		/* We have to first select the drop down element with select tag, then we have to locate the options 
		 * element on that dropdown. first we have to select drop down box, after thet we have to select all the 
		 * option coming when we click on drop down. thats why after slecting drop down box we have to create
		 * object of the SELECT CLASS. and in that object we have to send the web element variable we crated
		 * as parameter, Here in this case its 'DrpcountryEle'
		 * 
		 * when we see the select tag on DOM then we can use this method, by using select
		 * class
		 */

		Select drpcntry = new Select(DrpcountryEle);
		
		/*the Select class Object i.e 'drpcntry' represents all the options which comes when we click on dropdown
		 * 
		 */

//		drpcntry.selectByVisibleText("China"); 
		
		/* we can also use select by value */ 
		
//		drpcntry.selectByValue("5");  // Use this selctbyValue only value 'attribute=value' is available in DOM on option tag
		
//		drpcntry.selectByIndex(5);  //index start with 0 for place holder.
		
		
		
		/*2) If we have to find total options in dropdown 
		 * .getOptions() will get all the options present in the drop down
		 * 
		 * */
		
	    List<WebElement>options=drpcntry.getOptions();  //Every option in drop down represent the web element
	    
	    System.out.println("Total number of options" + options.size());
		
	    
		/* 3) to print options in console window */
		
		/*
		 * for(int i=0; i<options.size(); i++)               //options.size() will give dropdown elements,
		 * 											           those are not simple text, thats why to print options from drop down
		 * {											        we have to apply getText() method
		 * 	System.out.println(options.get(i).getText());
		 * 	
		 * }	 
		 * 
		 * 
		 */
		
	    
	    for(WebElement opt:options)
	    {
	    	System.out.println(opt.getText());      //We can get it thorough enhanced for loop too
	    }		

	}

}
