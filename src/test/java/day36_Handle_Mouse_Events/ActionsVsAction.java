package day36_Handle_Mouse_Events;

import java.net.InterfaceAddress;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;




//Actions is a class
//Action is an Interface



public class ActionsVsAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		
		Actions act = new Actions(driver);
		
		 Action myaction = act.contextClick(button).build();   //created action stored into variable
		 
		 
		 myaction.perform();     //perfoming or completing action
		 
		 
		 
		 
		
//Now this this i only want to build the action and perform later
//		so for that we have to save this build action into certain variable and whenever we want to perform action
//		that time we can use that variable to call the perform action.
		
// the return type of build method avriable will be 'Action' interface type of variable******* 	
		
		
//  Differece between Actions and Action
		
//		 Actions -- is a class, will be used to perfom mouse actions, we can create object of class and perofrm all the
//		 				methods using its object
//		 			
//		 
//		 Action -- is an Interface, will be used to store created actions, as its an interface so we can not create 
//		 			an object but we can create a variable to store actions
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
