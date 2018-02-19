  @WebDDExcel
Feature: Google Search

  
  @WebDDExcel
  Scenario Outline: Getting Data from Excel
    Given Checker
    Then I verify the "<username>" and "<password>" values comming from Excel


    #for csv, txt, xls files specify datafile location
    Examples: {'datafile' : 'src/main/resources/data/testData.xls' , 'sheetName' : 'loginSheet'}
    
