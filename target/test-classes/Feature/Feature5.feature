
Feature:  View Icon of the Application 
  

  @tag1
  Scenario Outline: 
    Given The emulator is open
    And  clicks on continue, ok button 
    When user clicks on view icon
    And  scrolls down 
    And clicks on search view icon
    Then user clicks on filter
    And user enters the <word> 

    Examples: 
      | word  |
      | Fontal|