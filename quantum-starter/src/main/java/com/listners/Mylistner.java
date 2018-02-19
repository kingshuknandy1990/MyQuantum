package com.listners;
import org.testng.ITestContext;
import org.testng.ITestListener ;
import org.testng.ITestResult;

import com.quantum.utils.AppiumUtils;

import net.sf.saxon.expr.sort.ItemToBeSorted;




public class Mylistner implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		AppiumUtils.getAppiumDriver().closeApp();
	     AppiumUtils.getAppiumDriver().close();
	     AppiumUtils.getAppiumDriver().quit();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

/*	public void onTestFailure(ITestResult tr) {
		super.onTestFailure(tr);
		 AppiumUtils.getAppiumDriver().closeApp();
	     AppiumUtils.getAppiumDriver().close();
	     AppiumUtils.getAppiumDriver().quit();
	}*/
}
