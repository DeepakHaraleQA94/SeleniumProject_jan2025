package Nokri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class expiredCertipicate {

	@Test
	public void test() {
		
		ChromeOptions caption = new ChromeOptions();
		caption.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(caption);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		
	}
}
