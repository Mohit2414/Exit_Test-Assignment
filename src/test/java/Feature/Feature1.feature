  Feature: Verifies the animation button of the App
 
 
  @tag1
  Scenario: Check the animation function of the app
    Given The emulator is open
    And clicks on continue, ok button
    When user clicks on the Animation
    And clicks on the hide-Show animation
    Then verifies the hide show page
    And closes the app
    


 