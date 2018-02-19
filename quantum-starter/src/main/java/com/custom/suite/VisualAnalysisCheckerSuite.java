package com.custom.suite;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Application;

import org.testng.annotations.Test;

import com.custom.steps.ApplicationSpecificSteps;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.quantum.steps.PerfectoApplicationSteps;
import com.quantum.steps.PerfectoDeviceSteps;
import com.quantum.utils.DeviceUtils;


/**
 * @author kingshuk.nandy
 *
 */
public class VisualAnalysisCheckerSuite extends WebDriverTestCase {

	
	/**
	 * Validates Image checkpoint by taking image path from repository
	 * @param data
	 */
	@Test(description="checking perfecto Image attributes")
	@QAFDataProvider(dataFile = "src/main/resources/data/imageList.csv")
	public void imageVerificationTech1(Map<String, String> data) {
	DeviceUtils.goToHomeScreen();
	Map<String, Object> params1 = new HashMap<>();
	params1.put("content", data.get("imagePath"));
	Object result1 = getDriver().executeScript("mobile:image:find", params1);
	System.out.println("Check:"+result1);
	
	}
	
	@Test(description="checking perfecto Image attributes")
	@QAFDataProvider(dataFile = "src/main/resources/data/imageList.csv")
	public void imageVerificationTech2(Map<String, String> data) {
	DeviceUtils.goToHomeScreen();
	DeviceUtils.waitForPresentImageVisual(data.get("imagePath"), 5);
	
	}

}
