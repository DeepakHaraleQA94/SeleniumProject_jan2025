package Nokri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/mnjuser/homepage?utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register");
	Thread.sleep(3000);
		driver.findElement(By.id("usernameField")).sendKeys("haraledeepak84@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Deepak@94");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	}

}
