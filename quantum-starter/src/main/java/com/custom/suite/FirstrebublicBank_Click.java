package com.custom.suite;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.quantum.utils.AppiumUtils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FirstrebublicBank_Click extends WebDriverTestCase {

	@Test
	public void test() throws InterruptedException {
		//AppiumUtils.getAndroidDriver()
		//AndroidDriver driverOther = (AndroidDriver) getDriver().getUnderLayingDriver();
		// write your code here
		AndroidDriver driverOther=AppiumUtils.getAndroidDriver();
		Thread.sleep(2000);
		Map<String, Object> params11 = new HashMap<>();
		params11.put("location", "705,1571");
		Object result11 = driverOther.executeScript("mobile:touch:tap", params11);

		Thread.sleep(2000);

		driverOther.getKeyboard().sendKeys("testuser105c7");

		Map<String, Object> params3 = new HashMap<>();
		params3.put("location", "284,1051");
		Object result3 = driverOther.executeScript("mobile:touch:tap", params3);

		driverOther.getKeyboard().sendKeys("Frb@123!");
		Thread.sleep(2000);
		Map<String, Object> params5 = new HashMap<>();
		params5.put("location", "790,1321");
		Object result5 = driverOther.executeScript("mobile:touch:tap", params5);

		Thread.sleep(6000);

		Map<String, Object> params6 = new HashMap<>();
		params6.put("location", "720,2025");
		Object result6 = driverOther.executeScript("mobile:touch:tap", params6);

		// ==================
		// public static void tabByCoordinates(AppiumDriver driver, WebElement
		// element,int fingers,int duration){
		// driver.tap(1, (AndroidElement)
		// driver.findElementsByXPath("//*[@text='Business Money Market ···7364']"), 2);

		List<WebElement> list = driverOther.findElementsByXPath("//*[@text='Business Money Market ···7364']");
		/*
		 * Iterator ite=list.iterator(); while(ite.hasNext()) { WebElement
		 * ele=(AndroidElement) ite.next();
		 * System.out.println("Check:================"+ele.getText()); }
		 */
		driverOther.tap(1, (AndroidElement) list.get(0), 2);
		// reportiumClient.testStep("step1"); // this is a logical step for reporting
		// add commands...
		// reportiumClient.testStep("step2");
		// more commands...
	}
}
