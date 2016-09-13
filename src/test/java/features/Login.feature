Feature:
  As a user
  I want to login to the application
  so that i can check bills

  @devDone
 Scenario: login to application
   Given I initialize Appium driver
   Given the user is on login page
   And she enter user name as 011111012@gmail.com
   And she enter pwd as password
   When she click login button
   Then she should be login in to the application