Feature: Navia Online Trading Market Post Market Testing 

Scenario: Login Navia
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Otp Verification and enter manualy
    And User Click Login Again
    
    
Scenario: Check the Portfolio Value Calculation

When User Check the Stock Market Investment , Current and Overall profits Calculation
When User Check the Mutual Funds Investment , Current and Overall profits Calculation
   
Scenario: Check the Funds Calculation

When User get the available for investing , margin used and utilization value

