
Feature: Verifies the NFC icon of the application
  
  @tag1
  Scenario: Verfies the NFC icon of application
    Given The emulator is open
    And clicks on continue, ok button
    When user click on NFC icon
    Then clicks on TechFilter icon
    And closes the app

  