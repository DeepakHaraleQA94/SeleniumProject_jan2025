package TestNgframework;

import org.testng.annotations.Test;

public class ClassB {

	@Test(groups = "sanity")
	public void TC1() {
		System.out.println("hello1");
	}
	
	@Test(groups = "regression")
	public void TC2() {
		System.out.println("hello2");
	}
	
	@Test(groups = "smoke")
	public void TC3() {
		System.out.println("hello3");
	}
	
	@Test(groups = "functional")
	public void TC4() {
		System.out.println("hello4");
	}
}
