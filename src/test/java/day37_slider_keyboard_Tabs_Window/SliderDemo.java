package day37_slider_keyboard_Tabs_Window;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		driver.manage().window().maximize();
		
		
	//First we have to find the minimum slider
		
		      WebElement min_slider= driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		
	// we have to find the location of this minimum slider as its horizontal like x axis	
		
		
		     System.out.println("Location of the min_slider before moving" + min_slider.getLocation());
		     
		     										       //getlocation() method belongs to WebElement not the driver
		
		     											//as min_slider belongs to webElement
		     
// .getLocation() return point type of Object (59,250)=(x, y)	=(x axis, y axis)	
		
		
// if we want to get only x axis or y axis value we can use
		
		
		     System.out.println("Location of the min_slider" + min_slider.getLocation().getX());
		
	//	OR
		
		     System.out.println("Location of the min_slider" + min_slider.getLocation().getY());
		     
		     
		     
//		     we move slider using mouse action so we have to create object of action class
		    
		     
		     Actions act = new Actions(driver);
		     
		     act.dragAndDropBy(min_slider, 100, 250).perform();
		     
		     
//here we have to increase source according to where we have to slide the slider, along x axis and keep y axis constant
//		     thats why we took 100 at place of 59, and kept 250 as it is
		     
		     System.out.println("Location of the min_slider after moving" + min_slider.getLocation());  //output - Location of the min_slider after moving(158, 250)
		
		     
		     
	//Maximum slider
		     
		     
		     
		    WebElement max_slider =  driver.findElement(By.xpath("//span[2]"));
		     
		    System.out.println("Location of the min_slider before moving" + max_slider.getLocation());
		    
		    act.dragAndDropBy(max_slider, -100, 250).perform();
		    
		    System.out.println("Location of the min_slider after moving" + max_slider.getLocation());
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
	}

}
