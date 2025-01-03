package SeleniumBasic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot {

	
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://magnus.jalatechnologies.com/");
	
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 System.out.println(src);
	 
	String random = RandomString.make(3);
//	System.out.println(random);
	 
	 File des = new File("C:\\Users\\Sarvadnya\\eclipse-workspace\\Jala_SeleniumProject\\screenshot\\"+random+".png");
	 
	 FileHandler.copy(src, des);
}
}
