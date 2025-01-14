package testPage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.loginPage;
import sapmle.PrerequisiteSteps;

public class HomeTestPage extends PrerequisiteSteps {
	HomePage home;
	public HomeTestPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		intitilization();
		loginPage login = new loginPage();
		login.enterUserName(prop.getProperty("username"));
		login.enterPassword(prop.getProperty("password"));
		login.clickOnSignInBTn();
		Thread.sleep(3000);
		 home = new HomePage();
				
	}
	
	@Test
	public void validateHomePage() {
		boolean textValidation = home.validateHomeText();
	Assert.assertTrue(textValidation);
	Reporter.log("text is visibile ", true);
	}

	
}
