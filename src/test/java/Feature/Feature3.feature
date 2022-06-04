
Feature: Graphics page
  

  @tag1
  Scenario: check functionality of graphics page
    Given The emulator is open
    And clicks on continue, ok button
    When user click on graphics icon
    Then user click on BitMap mesh icon 
    And close the application

