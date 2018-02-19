package com.custom.suite;


import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;


public class MultipleExcelSheetDataFetch extends WebDriverTestCase {

	@Test(description="checking perfecto Image attributes")
	@QAFDataProvider(dataFile = "src/main/resources/data/testData.xls",sheetName="communitySheet")
	public void imageVerificationTech1(Map<String, String> map) {
	
		 System.out.println("----------------------------------");
				for (Map.Entry<String, String> entry : map.entrySet())
				{
				    System.out.println(entry.getKey() + ":::" + entry.getValue());
				    System.out.println("==================================");
				}
	//System.out.println("UserName:"+data.get("username")+"Password"+data.get("password"));
	}
}
