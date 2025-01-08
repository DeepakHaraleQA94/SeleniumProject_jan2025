package Nokri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	@Test(invocationCount = 10)
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("abc.pdf");
	Thread.sleep(3000);
		driver.findElement(By.id("usernameField")).sendKeys("haraledeepak84@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Admin@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(6000);
//		driver.findElement(By.linkText("View")).click();
		driver.findElement(By.xpath("//a[text()=' profile']")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//em[text()='editOneTheme']")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("saveBasicDetailsBtn")).click();
		Thread.sleep(6000);
//		driver.findElement(By.xpath("//input[@value='Update resume']")).sendKeys("C:\\Users\\Sarvadnya\\OneDrive\\Desktop\\latest resume\\Deepak_3years_Automation.pdf");
		 driver.findElement(By.xpath("(//span[text()='editOneTheme'])[2]")).click();
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("//button[text()='Save']")).click();
		 Thread.sleep(6000);
//		 driver.findElement(By.xpath("(//span[text()='editOneTheme'])[3]")).click();
//		 Thread.sleep(6000);
//		 driver.findElement(By.xpath("//button[text()='Save']")).click();
		 driver.close();
	}

}
