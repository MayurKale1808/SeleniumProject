package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeUse {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		WebElement txtemail = driver.findElement(By.name("Email"));
		txtemail.clear();
		txtemail.sendKeys("admin@yourstore.com");
		

		WebElement psswrd = driver.findElement(By.name("Password"));
		psswrd.clear();
		psswrd.sendKeys("admin");

		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();

		Thread.sleep(5000);

		String act_title = driver.getTitle();

		String exp_title = "Dashboard / nopCommerce administration";
		
		System.out.println(act_title);
		System.out.println(exp_title);

		if (act_title.equals(exp_title)) {
			System.out.println("Test is passed");

		} else {
			System.out.println("Test is failed");
		}
		Thread.sleep(5000);

		// driver.close();
		driver.quit(); 

	}

}
