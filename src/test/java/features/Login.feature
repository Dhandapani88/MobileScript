Feature:
  As a user
  I want to login to the application
  so that i can check bills

 Scenario: login to application
   Given the user is on login page
   And she enter user name as haroon@azizpour.de
   And she enter pwd as RustyPoodle1
   When she click login button
   Then she should be login in to the application