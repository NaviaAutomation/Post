Feature: Current IPO

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
    And User MouseOver Dashboard and click IPO/NFO and Click
    And User Select Current IPO and Click Apply "1"
    And User enter UPI ID , Category , Quantity (Lots) , BID Options and Price Cut 
    And User Click Agree and Click Submit
    And User Clik Yes For IPO Amount Payable