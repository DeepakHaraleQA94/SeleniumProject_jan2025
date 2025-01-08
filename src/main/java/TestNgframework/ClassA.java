package TestNgframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {
	@Test(groups = "smoke")
	public void TC5() {
		System.out.println("hello5");
		
	}
	
	@Test(groups = "functional")
	public void TC6() {
		System.out.println("hello6");
	}
	
	@Test(groups = "sanity")
	public void TC7() {
		System.out.println("hello7");
		Assert.fail();

	}
	
	@Test(groups = "smoke")
	public void TC8() {
		System.out.println("hello8");
		Assert.fail();

	}
}
