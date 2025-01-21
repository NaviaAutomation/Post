Feature: Rename the MarketWatch

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

When User right click marketwatch name "<RenameMarketWatch>" and click Rename "<New MarketwatchName>"
And User Verify Marketwatch is Limit

 Examples:
           |RenameMarketWatch|MarketwatchName|
           |ThirdMW|ThirdM|
           |SecondMW|SecondM|
           |FifthMW|FifthM|
           |FourthMW|FourthM|
           