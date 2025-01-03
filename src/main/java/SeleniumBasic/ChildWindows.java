package SeleniumBasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindows {

	
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
		driver.findElement(By.linkText("More")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Popups")).click();
		driver.findElement(By.linkText("Popup One")).click();
		
//		String singleWindow = driver.getWindowHandle();
//		System.out.println(singleWindow);
		
		Set<String> multiWindows = driver.getWindowHandles();
		System.out.println(multiWindows);
		
		Iterator<String> windows = multiWindows.iterator();
		String mainWindow = windows.next();
		System.out.println(mainWindow);
		String childWindow = windows.next();
		System.out.println(childWindow);
		driver.switchTo().window(childWindow);
		driver.manage().window().maximize();
		
		driver.switchTo().window(mainWindow);
		
		driver.findElement(By.id("promptBtn")).click();
		
		
		
		
		
		
		
		
	}
}
