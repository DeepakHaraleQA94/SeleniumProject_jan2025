package TestNgframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {

	@Test
	public void validateLoginPage() {
		System.out.println("succefully landed on home page");
	}
	
	
	@BeforeMethod
	public void beformethod() {
		System.out.println("enter usernname , password and click on signIN button");
	}
	
	
	@AfterMethod
	public void AfterMethos() {
		System.out.println("logout");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("close browser");
	}
	
	@BeforeClass
	public void beforClass() {
		System.out.println("enter URl");
	}
	
	
	
	
}
