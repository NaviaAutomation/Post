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
    
    
Scenario: Add Any Script and Verify
     When Navigate to home page
    When User Search "NSE","HYUNDAI" Scrip add in MarketWat
    
Scenario: User Placing the Order
    When Navigate to home page
    And User mouse the scrip Selected "HYUNDAI" 
    And User Click the Buy scrip for Selected "HYUNDAI" Scrip
    And User Click Market then Limit
    And User Enter Amount in Price Text Box "4232"
    And User Click Buy
    And User Click Yes Popup
    Then Verify the Buy Scrip Notification Pop up
    
Scenario: Modify Scrip and Verify
    When Navigate to home page
    And User Click Pending Orders
    And User Click Edit Icon for Selected Scrip "HYUNDAI"
    And User Click Modify
    And User Modify Quality
    And User Modify Price
    And User Click Update
    And User Click Yes in Pop up
    Then Verify the Modify Notification popup
    
Scenario: Cancel the Scrip

    When Navigate to home page
    And User Click Pending Order
    And User Click Selected Scrip "HYUNDAI" Edit
    And User Click Cancel
    And User Click Yes for Confirmation
    Then User Verify the Cancellation Notification Popup
    
Scenario: Payin add money in navia
    When Navigate to home page
    And User Click Add Money
    And User enter money in amount to add
    And User Choose Pay Using UPI
    And User Enter UPI/ID/Mobile Number and click pay now
    
Scenario: Verify the Charts Changes in Different Minutes and Days
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
