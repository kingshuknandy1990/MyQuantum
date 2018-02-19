package com.custom.steps;

import java.util.HashMap;
import java.util.Map;

import com.qmetry.qaf.automation.step.QAFTestStepProvider;

import com.qmetry.qaf.automation.ui.WebDriverTestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@QAFTestStepProvider
public class ApplicationSpecificSteps {

	
	@Then("I verify the \"([^\"]*)\" image in the Home Screen")
	public void imageVerifyHomeScreen(String imgPath)throws Throwable {
		
		Map<String, Object> params1 = new HashMap<>();
		params1.put("content", imgPath);
		Object result1 =new WebDriverTestBase().getDriver().executeScript("mobile:image:find", params1);
		System.out.println("Check:"+result1);
		
	}
	
	//@Then("I then verify the \"([^\"]*)\" and \"([^\"]*)\"  values comming from Excel")
	@Then("I verify the \"([^\"]*)\" and \"([^\"]*)\" values comming from Excel")
	public void passingDataFromExcel(String username,String pass )throws Throwable {
		
		System.out.println("UserName:"+username+"-------------"+"Password"+pass);
		
	}
	
	@When("Checker")
	public void Checker(){
		
		System.out.println("Demo Test Case");
		
	}
	
	@Then("I Start Object Optimization")
	public void startObjectOptimization(){
		Map<String, Object> pars = new HashMap<>();
		new WebDriverTestBase().getDriver().executeScript("mobile:objects.optimization:start", pars);	
	}
	
	@And("I Stop Object Optimization")
	public void stopObjectOptimization(){
		Map<String, Object> pars = new HashMap<>();
		new WebDriverTestBase().getDriver().executeScript("mobile:objects.optimization:stop", pars);
	}
}
