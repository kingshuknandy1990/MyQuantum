package com.custom.suite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.quantum.utils.DeviceUtils;


public class Suite1 extends WebDriverTestCase {

	@BeforeTest
	public void beforeTest() {
		DeviceUtils.installApp("PRIVATE:Kingshuk/com.jquiz.act.apk", true);
	}
	
	@Test
	public void VerifyingHomePage() throws InterruptedException {
		System.out.println("Contol Till Here");
		DeviceUtils.startApp("com.jquiz.act", "identifier");;
		Thread.sleep(5000);
		//DeviceUtils.swipe(start, end);;
	}
	
	@AfterTest
	public void afterTest() {
		DeviceUtils.uninstallApp("com.jquiz.act", "identifier");
	}
}


