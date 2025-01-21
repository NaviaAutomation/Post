Feature: Delete the MarketWatch

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

When User right click marketwatch name "<DeleteMarketWatch>" and click Delete

 Examples:
           |DeleteMarketWatch|
           |ThirdM|
           |SecondM|
           |FifthM|
           |FourthM|
           