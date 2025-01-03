package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionMethod {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement doubleClick1 = driver.findElement(By.id("doubleClickBtn"));
		
		Actions action = new Actions(driver);
		action.doubleClick(doubleClick1).perform();
		
		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(rightClick).perform();
	}
}
