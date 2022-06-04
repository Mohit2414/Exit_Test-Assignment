
Feature: Verifies the App function in the application
 

  @tag1
  Scenario: Check the App Functionality
    Given The emulator is open
    And  clicks on continue, ok button 
    When user clicks on the App icon
    And click on Action Bar icon
    Then click on Display Options icon
    And click on Display_Show_Title icon
    Then click on Display_Show_Logo icon and verified
    Then closes app
    
