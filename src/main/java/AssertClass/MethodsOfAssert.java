package AssertClass;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodsOfAssert {

	
	@Test
	public void test() {
		 String ExpectedResult="Hello";
		 String ActualResult="Hello1";
//		 Assert.assertNotEquals(ActualResult, ExpectedResult, "Result is matching");
//		 Reporter.log("TC2 is running",true);
		 Assert.fail();
	}
	
	
	@Test(enabled = false)
	public void assertrue1() {
		 boolean Result=false;
		 
		 Assert.assertFalse(Result, "Result is false");
		 Reporter.log("TC3 is running", true);

	}
	
	
	@Test(enabled = false)
	 public void TC5() 
	 
	 {
	String str="hello";
	Assert.assertNotNull(str,"Value is not null");
	Reporter.log("TC5 is running", true);
	 }

	
	
	
	
	
}
