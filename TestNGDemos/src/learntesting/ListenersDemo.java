package learntesting;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started and, test case name is"+result);
		
		}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case success and, test case name is"+result);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed and, test case name is"+result);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped and, test case name is"+result);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test case finished");	
	}
	
}
