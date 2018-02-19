package com.custom.suite;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.quantum.steps.PerfectoApplicationSteps;
import com.quantum.utils.DeviceUtils;

public class GM_Xpath_isPresent extends WebDriverTestCase {

	@Test
	public void case1() throws InterruptedException{
	
		getDriver().findElementByXPath("//*[@label='Owner Manual']").click();
		PerfectoApplicationSteps.iSet("Remote Vehicle", "//*[@label='Search']");
		Thread.sleep(5000);
		//Remote Vehicle Start
		QAFWebElement element=getDriver().findElementByXPath("//*[@label='Keys and Locks']/following::XCUIElementTypeStaticText[contains(@label,'Remote Vehicle') and @hittable='true']");
		System.out.println("IS Present:"+element.isPresent());
		System.out.println(element.isDisplayed());
		
	}
}
