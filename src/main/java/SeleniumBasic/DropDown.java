package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		userName.sendKeys("training@jalaacademy.com");
		
		WebElement password = driver.findElement(By.name("Password"));
		password.sendKeys("jobprogram");
		
		WebElement signInBtn = driver.findElement(By.xpath("( //button[@type='button'])[2]"));
		signInBtn.click();
		Thread.sleep(3000);
		 driver.findElement(By.linkText("Employee")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Create")).click();
		 
		 WebElement countryDropDown = driver.findElement(By.id("CountryId"));
		 Thread.sleep(3000);
		 Select select = new Select(countryDropDown);
		 select.selectByVisibleText("India");
		 select.selectByIndex(2);
	}
}
