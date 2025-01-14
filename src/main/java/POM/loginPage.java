package POM;

import java.io.IOException;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sapmle.PrerequisiteSteps;

public  class loginPage extends PrerequisiteSteps {

//	1. page Object factory  2. cunstructor  3.Action function
	

	
	public loginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "UserName")
	WebElement username; 
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(id = "btnLogin")
	WebElement clickOnBtn;
	
	
	
	public  void enterUserName(String uname) {
		username.sendKeys(uname);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnSignInBTn() {
		clickOnBtn.click();
	}
	
	
	
	
	
}
