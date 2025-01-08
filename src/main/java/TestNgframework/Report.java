package TestNgframework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Report {
	
	@Test(priority = 0)
	public void generateReport() {
		System.out.println("hello");
		Reporter.log("validateloginPage");
	}
	
	@Test(priority = 1)
	public void generateReport1() {
		System.out.println("hello1");
		Reporter.log("validateHomePage", false);
	}

}
