package SeleniumBasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class childwindow2 {

	
	@Test
	public void test() throws InterruptedException {
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
		
//		String window = driver.getWindowHandle();
//		System.out.println(window);
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		Iterator<String> itr = windows.iterator();
		String mainWindow = itr.next();
		System.out.println(mainWindow);
		String childwindow = itr.next();
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		
		
	}
}
