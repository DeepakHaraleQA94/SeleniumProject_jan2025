package sapmle;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrerequisiteSteps {

	
	public static WebDriver driver;
	public static  Properties prop;
	
	public PrerequisiteSteps() throws IOException{
		 prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Sarvadnya\\eclipse-workspace\\Jala_SeleniumProject\\src\\main\\java\\properties\\config.properties");
	    prop.load(file);
	}
	
	public static void intitilization() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
	}
	
	
}
