package com.custom.suite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.quantum.utils.AppiumUtils;
import com.quantum.utils.DeviceUtils;

public class BT_UnableToConnect extends WebDriverTestCase {

	@Test
	public void checker() throws InterruptedException {
	getDriver().get("www.google.com");	

	}
}
