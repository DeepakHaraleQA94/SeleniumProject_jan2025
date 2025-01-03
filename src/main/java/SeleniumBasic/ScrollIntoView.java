package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
	
//	 WebElement clickNext = driver.findElement(By.linkText("Next"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;
//	 js.executeScript("document.getElementById('Next').scrollIntoView()");
	 js.executeScript("alert('hello')");
}

}
