Feature: Check Alert Functionality

Scenario: Login Navia
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Otp Verification and enter manualy
    And User Click Login Again
    When Navigate to home page
    And User click the search box
    And User Search any "ZOMATO" Script
    And User Mouse Over and Add a Script
    When Navigate to home page
    And User Click "ZOMATO" script in marketwatch
    And User Click Price Alert
    And User Click "> Greater then" in Price Alert
    And User Enter "" Value in Price Alert
    And User Click Save button 
    When Navigate to home page
    And User click the search box
    And User Search any "wipro" Script
    And User Mouse Over and Add a Script
    When Navigate to home page
    And User Click "WIPRO" script in marketwatch
    And User Click Price Alert
    And User Click lesser than "< Lesser then" in Price Alert
    And User Click Save button 