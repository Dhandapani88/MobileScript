Feature:
  As a user
  I want to login to the application

#  @dp
#    Scenario: Uninstallation of old app and Installation of new App
#    Given I uninstall old app
#    And I install new app

  @devDone
  Scenario: login to application
    Given I initialize Appium driver
    And I should see "Sign in to review your account" on the login page
    And I should see "Forgotten log in details" link
    And I should see "O2 Community" link at bottom
    And I should see "O2 Gurus" link at bottom
    And I should see "More from O2" link at bottom
    And I login to the app with "011111012@gmail.com"
    And I enter the password as "password"
    And I click login button
    Then I should enter the pin
    And I should see fingerprint ID Page as following
    | Sign in faster with fingerprint ID |
    | Use fingerprint ID                                   |
    | Not now                                                     |
    Then I should click not now button
    And I should see fingerprint ID Messages
    |Fingerprint ID for "My O2"|
    |You can turn on fingerprint ID at any time by going to the main menu, choosing Settings, and selecting fingerprint ID.|
    Then I should click ok button
    Then I should click ok button
#    And I should see Broadcast Message
#    |Title|
#    |This is a message for android 7.9.0-debug|
    And I should see home screen
    Then I should signout
