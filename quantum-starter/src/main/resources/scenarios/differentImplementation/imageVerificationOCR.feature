@Native
Feature: OCR Example Feature
  #Sample Test Scenario Description

  @NativeDDcsv
  Scenario Outline: Searching image location from CSV by Custom Steps
    Given I go to the device home screen
    Then I verify the "<imagePath>" image in the Home Screen

    #for csv, txt, xls files specify datafile location
    Examples: {'datafile' : 'src/main/resources/data/imageList.csv'}
    
    
    @NativeDDcsv
    Scenario Outline: Searching image location from CSV by Quantum Steps
    Given I go to the device home screen
    Then I wait "5" seconds to see the image "<imagePath>"
    Then I take a screenshot

    #for csv, txt, xls files specify datafile location
    Examples: {'datafile' : 'src/main/resources/data/imageList.csv'}