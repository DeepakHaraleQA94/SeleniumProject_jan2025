package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;
	@FindBy(xpath = "//h1[text()='Welcome to JALA Academy']")
	WebElement homeText;
	
	@FindBy(xpath = "//span[text()='Logout']")
	WebElement logOutBtn;
	
	@FindBy(linkText = "Employee")
	WebElement employeeTab;
	
	@FindBy(linkText = "Create")
	WebElement createTab;
	
	@FindBy(linkText = "Search")
	WebElement searchTab;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateHomeText() {
		boolean text = homeText.isDisplayed();
		return text;
	}
	
	public void clickOnLogOutBtn() {
		logOutBtn.click();
	}
	
	public void clickOnEmployeeTab() {
		employeeTab.click();
		createTab.click();
	}
}
