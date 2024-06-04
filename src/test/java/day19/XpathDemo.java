package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://demo.nopcommerce.com/");
		driver.get("https://opensource-demo.orangehrmlive.com/");

//		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//div[@class='picture']/a/img")).click();
		
//		driver.findElement(By.xpath("//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"]")).click();
		
//		driver.findElement(By.xpath("//a[text()='MacBook']")).click();
		
//		driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).click();
		
//		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/h4[1]/a[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		WebElement curretUrl = driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']/child::button"));
		
		curretUrl.click();
		
		
//		Thread.sleep(2000);
//		
//		
//		
//		
//		
//		
//		System.out.println("URL is =" + r);
		
		
		
		
		
//		productName.getText();
		
//		System.out.println(productName);
		
		
		
		
		
		
		
		
		
		
		
	}

}
