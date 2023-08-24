package extentUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listenerr extends CustomReports implements ITestListener {
	ExtentReports extent = CustomReports.extentReporterGenerator();
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test is Passed");	
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test is Failed");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test is Skipped");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
	
	

}
