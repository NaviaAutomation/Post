Feature: Create MarketWatch

Scenario: Login Navia
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Otp Verification and enter manualy
    And User Click Login Again

Scenario Outline: create a marketwatch

When User click plus symbol enter a marketwatch name "<MarketWatch>" and click create
And User Verify Marketwatch is Limit

 Examples:
           |MarketWatch|
           |SecondMW|
           |ThirdMW|
           |FourthMW|
           |FifthMW|
           

