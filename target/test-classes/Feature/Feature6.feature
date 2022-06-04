
Feature: Failed TestCase


  @tag1
  Scenario: To show a failed testcase
    Given The emulator is open
    And  clicks on continue, ok button 
    When user clicks on content icon
    And click on clipboard icon
    Then closes the app
    
 
