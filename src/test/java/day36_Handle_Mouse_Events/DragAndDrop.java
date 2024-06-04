package day36_Handle_Mouse_Events;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//We can only do drag and drop on the same website.
// we can not drag and drop from desktop to web site, or website to website 




public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		

// in drag and drop two things are important source and target element
		
		
		
		
		WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));  //source element
		
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));  //target element
		
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(rome, italy).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
