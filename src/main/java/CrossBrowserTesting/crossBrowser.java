package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class crossBrowser {
	WebDriver driver;
	
	@Parameters("browserName")
	@Test
	public void test(String browserName) {
		 
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equals("edge")) {
			driver = new EdgeDriver();
		}else {
			System.out.println("please enter the correct browser name");
		}
		
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
	}
	
}
