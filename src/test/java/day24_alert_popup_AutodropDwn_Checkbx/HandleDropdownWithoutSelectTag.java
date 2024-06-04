package day24_alert_popup_AutodropDwn_Checkbx;

import java.nio.file.spi.FileSystemProvider;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropdownWithoutSelectTag {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
//		clicking on the dropdown
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		
		List<WebElement> options = driver.findElements(By.xpath("//label[@class='checkbox'] "));
		
//	Total number of options
		
		System.out.println(options.size());
		
// Print all the options
		
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
