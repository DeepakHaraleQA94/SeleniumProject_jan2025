package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		

//		WebElement getName = driver.findElement(By.linkText("JALA Academy"));
		WebElement getName = driver.findElement(By.xpath("//b[text()='JALA Academy']"));
		String showName = getName.getText();
		System.out.println(showName);
		getName.isDisplayed();
		
//		WebElement userName = driver.findElement(By.id("UserName"));
		
		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		userName.sendKeys("training@jalaacademy.com");
		
		WebElement password = driver.findElement(By.name("Password"));
		password.sendKeys("jobprogram");
		
//		WebElement signInBtn = driver.findElement(By.id("btnLogin"));
		WebElement signInBtn = driver.findElement(By.xpath("( //button[@type='button'])[2]"));
		signInBtn.click();
		
		
	}

}
