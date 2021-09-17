package groupsdemo;

import org.testng.annotations.Test;

public class TestGroup1 {
	
	@Test(groups= {"smoke"})
	public void test1() {
		System.out.println("My first smoke test case");
	}
	
	@Test(groups= {"smoke"})
	public void test2() {
		System.out.println("My second smoke test case");
	}
	
	@Test(groups= {"smoke"})
	public void test3() {
		System.out.println("My third smoke test case");
	}
	
	@Test(groups= {"regression"})
	public void test4() {
		System.out.println("My first regression test case");
	}
	
	@Test(groups= {"functional"})
	public void test5() {
		System.out.println("My first functional test case");
	}
}
