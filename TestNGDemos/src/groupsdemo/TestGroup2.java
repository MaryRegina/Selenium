package groupsdemo;

import org.testng.annotations.Test;

public class TestGroup2 {
	
	@Test(groups= {"regression"})
	public void test6() {
		System.out.println("My second regression test case");
	}
	
	@Test(groups= {"regression"})
	public void test7() {
		System.out.println("My third regression test case");
	}
	
	@Test(groups= {"functional"})
	public void test8() {
		System.out.println("My second functional test case");
	}
	
	@Test(groups= {"smoke"})
	public void test9() {
		System.out.println("My fourth smoke test case");
	}
}
