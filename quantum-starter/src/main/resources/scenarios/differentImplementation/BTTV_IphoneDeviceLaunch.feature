@ApplicationLaunch
Feature: Driver Instantiation and Few operations Feature
  #Sample Test Scenario Description

  @ApplicationLaunch
  Scenario: Opening the applicaton and Clicking on the Xpath
    Given I start application by id "com.bt.internal.tve"
    Then I wait for "4" seconds
    Then I Start Object Optimization
	Then I click on "btn.TVChannel"
	And I Stop Object Optimization
	Then I close application by id "com.bt.internal.tve"
    
