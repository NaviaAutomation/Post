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
    
Scenario: Check Payin Functionality
     When Navigate to home page
    And User Click Add Money
    And User enter money in amount to add
    And User Choose Pay Using UPI
    And User Enter UPI/ID/Mobile Number and click pay now
    
Scenario: Check Charts Feeds
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
    
Scenario: Add Script

    When Navigate to home page
    When User Search "BSE","HDFCBANK" Scrip add in MarketWatch
    
    
Scenario: BankNifty Fluctuation
    When Navigate to home page
    When User Search "Banknifty" in Searchbox
    And User Click Futures
    And User mouse over "BANKNIFTY24DECFUT" and click add icon
    And Symbol Has been Added Successfully Notification Shown
    And User Click Clear in search box
    And User Click "BANKNIFTY24DECFUT"
    And User Click F&O
    And User Click Cancel button in Ready Made Pop up
    And User Click LTP
    And User Verify the Fluctuating
    
Scenario: BankNifty F&O Save Strategy     
    When Navigate to home page 
    When User Search "Banknifty" in Searchbox
    And User Click Futures
    And User mouse over "BANKNIFTY24DECFUT" and click add icon
    And Symbol Has been Added Successfully Notification Shown
    And User Click Clear in search box
    And User Click "BANKNIFTY24DECFUT"
    And User Click F&O
    And User Click Cancel button in Ready Made Pop up
    And User Click LTP
    And User Select any Call LTP Buy
    And User Select any Put LTP Sell
    And User Click Save Strategy
    And User enter Strategy Name "testdata36"
    And User Click Save 
    And User Click Strategy Message ok
    And User Click Place Order 
    
    
 Scenario: BankNifty Ready Made
    When Navigate to home page 
    When User Search "Banknifty" in Searchbox
    And User Click Futures
    And User mouse over "BANKNIFTY24DECFUT" and click add icon
    And Symbol Has been Added Successfully Notification Shown
    And User Click Clear in search box
    And User Click "BANKNIFTY24DECFUT"
    And User Click F&O
    And User Click Cancel button in Ready Made Pop up
    And User Click LTP
    And User Select any Call LTP Buy
    And User Select any Put LTP Sell
    And User click read made  
    And User Choose Ready made Strategy categories "Bearish"
    And User Select Strategy under categories "Put Ratio Back Spread"
    
    
    