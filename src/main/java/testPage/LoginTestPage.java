package testPage;

import java.io.IOException;

import org.jspecify.annotations.Nullable;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.loginPage;

import sapmle.PrerequisiteSteps;

public class LoginTestPage extends PrerequisiteSteps {

	public LoginTestPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	loginPage login;
	
	@BeforeMethod
	public void setup() throws InterruptedException, IOException{
		 intitilization();
		 login = new loginPage();
		 
	}
	
	@Test
	public void validateLoginPage() throws InterruptedException {
		login.enterUserName(prop.getProperty("username"));
		 login.enterPassword(prop.getProperty("password"));
		  login.clickOnSignInBTn();
		  
		Thread.sleep(3000);
		String actual = driver.getTitle();
		  Assert.assertEquals(actual, "Magnus");
		  Reporter.log("login page validated successfully..", true);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
}
