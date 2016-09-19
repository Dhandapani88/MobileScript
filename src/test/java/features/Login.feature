Feature:
  As a user
  I want to verify the native app screens

  @devDone
  Scenario: Uninstallation of old app and Installation of new App
    Given I initialize Appium driver
    Given I uninstall old app
    And I install new app
    Then I Quit Driver

  @devDone
  Scenario: Validate the Onboarding Screens
    Given I initialize Appium driver
    And I login to the app with "011111012@gmail.com"
    And I enter the password as "password"
    And I click login button
    Then I should enter the pin
    Then I should click not now button
    Then I should click ok button
    And I should see heading and sub_heading on Onboarding screens
      | Welcome to My O2    | Get a summary of your data usage, latest bill and more.        | Skip        |
      | Allowances          | Check your allowances and usage. Plus add Bolt Ons.            | Skip        |
      | Your bill           | View your latest bill and Device Plan info. And make payments. | Skip        |
      | Your bill in detail | Take a closer look at who you’ve been calling and texting.     | Skip        |
      | Multiple accounts   | See all of your accounts in one place.                         | Skip        |
      | Offers and perks    | Find exclusive offers and perks, just for you.                 | GET STARTED |
    And I click on Get Started Button
    Then I should click ok button on Broadcast Message
    Then I should signout

  @devDone
  Scenario: Verify the login journey and whats new screen
    Given I login to the app with "011111012@gmail.com"
    And I enter the password as "password"
    And I should see "Sign in to review your account" on the login page
    And I should see "Forgotten log in details" link
    And I should see "O2 Community" link at bottom
    And I should see "O2 Gurus" link at bottom
    And I should see "More from O2" link at bottom
    And I click login button
    Then I should enter the pin
    And I should see fingerprint ID Page as following
      | Sign in faster with fingerprint ID |
      | Use fingerprint ID                 |
      | Not now                            |
    Then I should click not now button
    And I should see fingerprint ID Messages
      | Fingerprint ID for "My O2"                                                                                             |
      | You can turn on fingerprint ID at any time by going to the main menu, choosing Settings, and selecting fingerprint ID. |
    Then I should click ok button
    And I should see the What's new information
      | What's new | Check for network issues                  | Live Status Checker helps you keep tabs on any faults or maintenance in your area. |
      | What's new | Clearer bill                              | Sync your phone contacts to see who you've been calling and texting                |
      | What's new | Data Bolt Ons roll over to the next month | Any unused data will be carried over to the following month.                       |
      | What's new | Low on data each month?                   | Upgrade your tariff to a bigger bundle                                             |
      | What's new | My O2 Card Wallet                         | Save your card details for quicker payment next time.                              |
      | What's new | O2 Wifi hotspot finder                    | Find your nearest free O2 Wifi hotspot, and save data when you're out and about.   |
    And I close the close icon on the what's new screen
    And I should see Broadcast Message
      | Title                                     |
      | This is a message for android 7.9.0-debug |
    Then I should click ok button on Broadcast Message
    And I should see home screen
    Then I should signout
