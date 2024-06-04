package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MackBook");
		
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MackBook");
		
//		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("MackBook");
		
		
//		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("MackBook");
		
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("MackBook");
		
		
		
		
		
		
		
		
		
		
		

	}

}
