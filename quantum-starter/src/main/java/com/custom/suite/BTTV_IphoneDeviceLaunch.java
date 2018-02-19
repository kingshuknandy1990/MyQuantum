package com.custom.suite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.quantum.utils.AppiumUtils;
import com.quantum.utils.DeviceUtils;

public class BTTV_IphoneDeviceLaunch extends WebDriverTestCase {

	@Test
	public void checkerOther() throws InterruptedException {
	///getDriver().get("www.google.com");	
	DeviceUtils.startApp("com.bt.internal.tve", "identifier");
    AppiumUtils.getIOSDriver().findElement(By.xpath("//*[@label='Main menu']")).click();
    Thread.sleep(6000);
    DeviceUtils.closeApp("com.bt.internal.tve", "identifier");
	}
}
