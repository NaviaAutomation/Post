Feature: Navia Online Trading Market Login 


Scenario: Login Navia
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Otp Verification and enter manualy
    And User Click Login Again
    
Scenario: User Count The NiFTY 50 Stock

And User Count and Print The "NIFTY" All Stock
And User Count and Print The "SENSEX" All Stock
And User Count and Print The "BANKNIFTY" All Stock

    