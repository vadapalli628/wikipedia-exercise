Feature: Search on Wiki

	Background: Launch browser and open the wiki Page
	
		Given User launch a browser
		And User opens URL "http://www.wikipedia.org/"
    

  Scenario Outline: Searche a string and validate the same string in Wikipedia
  	
 		Given user search term as "<searchinput>"
    And selects search language as English
    When clicks on Search Icon
    Then Search results heading matches search term "IBM"
    And close browser
    
    Examples: 
    |searchinput |
    |IBM|

  
    
   Scenario Outline: Search results page is available in other languages
  
    Given user search term as "<searchinput>"
    And selects search language as English
    When clicks on Search Icon
    Then Search results Page displays other languague links
    And close browser
    
    Examples: 
    |searchinput |
    |IBM|
  
    Scenario Outline: Search results page in the new language includes a link to the version in English
    
   	Given user search term as "<searchinput>"
    And selects search language as English
    When clicks on Search Icon
    And clicks on IBM Greek language link at Languages
    Then Search results Page has a link to the version in English
    And close browser
    
    Examples: 
    |searchinput |
    |IBM|
 