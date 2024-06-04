package day37_slider_keyboard_Tabs_Window;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabsAndWindowCommand {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		
		
//		driver.switchTo().newWindow(WindowType.TAB);  //switch to new tab and launch next URl
		
		driver.switchTo().newWindow(WindowType.WINDOW);    //Switch to new browser Window
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//		driver.manage().window().maximize();
		
		//the above line of code will first launch first link and then on the same page it will launch next link
		
//		but we want both links in different tabs.....till selenium it was not possible, but in selenium 4 its possible
		
		
//		for that they have given new command
		
//Syntax----		driver.switchTo().newWindow(WindowType.TAB);    .......see in above code betwwen two get commands
				
//		this command will launch the next command in new tab and also driver control will also point to new tab
		
		
		
//		to Switch betwee two browsers use same techinque as we used in switchin bwtween tabs
		
//		use Windows instead of tab
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
