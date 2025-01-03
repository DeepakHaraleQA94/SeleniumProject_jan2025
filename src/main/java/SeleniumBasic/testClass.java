package SeleniumBasic;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testClass {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
//		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
		
		
		String getTitle = driver.getTitle();
		System.out.println("page title is : "+getTitle);
		
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	String src = driver.getPageSource();
	System.out.println(src);
	
	}

}
