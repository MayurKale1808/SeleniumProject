package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
//		driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
//		driver.findElement(By.name("submit_search")).click();
//		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		
		List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));
		
		
		
		System.out.println("Number of sliders = "  + sliders.size());
		
		
		
		
		
		
		

	}

}
