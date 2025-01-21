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
    When Navigate to home page
    And User click the search box
    And User Search any "TBZ" Script
    And User Mouse Over and Add a Script "TRIBHOVANDAS BHIMJI ZAVERI LTD"
    And User POP Up Message Appear Verify POP UP
    When Navigate to home page
    And User mouse the scrip Selected "TBZ" 
    And User Click the Buy scrip for Selected "TBZ" Scrip
    And User Click Market then Limit
    And User Enter Amount in Price Text Box "TBZ"
    And User Click Buy
    And User Click Yes Popup
    Then Verify the Buy Scrip Notification Pop up
    When Navigate to home page
    And User Click Pending Orders
    And User Click Edit Icon for Selected Scrip "TBZ"
    And User Click Modify
    And User Modify Quality
    And User Modify Price
    And User Click Update
    And User Click Yes in Pop up
    And Verify the Modify Notification popup
    When Navigate to home page
    And User Click Pending Order
    And User Click Selected Scrip "TBZ" Edit
    And User Click Cancel
    And User Click Yes for Confirmation
    Then User Verify the Cancellation Notification Popup
    When Navigate to home page
    And User Click Add Money
    And User enter money in amount to add
    And User Choose Pay Using UPI
    And User Enter UPI/ID/Mobile Number and click pay now
    When Navigate to home page
    And User Click the Watch List
    And User Select scrip "S&P BSE SENSEX"
    And User Click Watch List Again
    And User mouse over the scrip "Nifty 50"
    And User Click the Charts
    And User Click the Candles Icon
    And User Choose Candle "candle"
    And User Click the Mintues
    And User Choose One Minute
    And Verify One Minute Feed Connection Value and Wait One Minute Very Feed Connection Changes
    And User Click the Five Minute
    And Verify Five Minute Feed Connection Valuebb
    And User Click One Day 
    And Verify One Day Feed Connection Value and Wait One Minute Very Feed Connection Changes
    
