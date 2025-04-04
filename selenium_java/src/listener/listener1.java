package listener;



import org.testng.ITestListener;

import org.testng.ITestResult;

import org.testng.Reporter;
 
public class listener1  implements ITestListener{

	@Override

	public void onTestFailure(ITestResult result)

	{

		Reporter.log("Test Failed: " +result.getName());	

	}

	@Override

	public void onTestSuccess(ITestResult result)

	{

		Reporter.log("Test success: " +result.getName());	

	}

	@Override

	public void onTestStart(ITestResult result)

	{

		Reporter.log("Test start: " +result.getName());	

	}
 
 
}

 