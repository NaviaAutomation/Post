Feature: Navia Online Trading Market Post Market Testing Nine FourtyFive Testing

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
    When User Search "Banknifty" in Searchbox
    And User Click Futures
    And User mouse over "BANKNIFTY24AUGFUT" and click add icon
    And Symbol Has been Added Successfully Notification Shown
    And User Click Clear in search box
    And User Click "BANKNIFTY24AUGFUT"
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
    When Navigate to home page 
    When User Search "Banknifty" in Searchbox
    And User Click Futures
    And User mouse over "BANKNIFTY24AUGFUT" and click add icon
    And Symbol Has been Added Successfully Notification Shown
    And User Click Clear in search box
    And User Click "BANKNIFTY24AUGFUT"
    And User Click F&O
    And User Click Cancel button in Ready Made Pop up
    And User Click LTP
    And User Select any Call LTP Buy
    And User Select any Put LTP Sell
    And User click read made  
    And User Choose Ready made Strategy categories "Bearish"
    And User Select Strategy under categories "Put Ratio Back Spread"
    When Navigate to home page 
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Buy Back"  
    And User Verify Buy Back Page
    When Navigate to home page 
    And User click the search box
    And User Search any "tcs" Script
    And User Mouse Over and Add a Script
    And User MouseOver Dashboard and Click Tools
    And User Click Basket
    And User add basket
    And Enter Basketname "Testing", description "Testing Purpose" and click add
    When Navigate to home page 
    And User mouse the scrip Selected "TCS" 
    And User Click the Buy scrip for Selected "TCS" Scrip
    And User Click Market then Limit
    And User Select Qty "2"
    And User Click Basket Icon
    And User Choose Basket "TESTING"
    And User Navigate to Basket and Click My Baskets 
    And User Click Place Order for Particular "TESTING" Baskets
    And User Execute following orders
    When Navigate to home page  
    And User click the search box
    And User Search any "tcs" Script
    And User Mouse Over and Add a Script
    And User MouseOver Dashboard and Click Tools
    And User Click Basket
    And User add basket
    And Enter Basketname "TESTING", description "Testing Purpose" and click add
    And User Navigate to Dashboard
    And User mouse the scrip Selected "TCS" 
    And User Click the Buy scrip for Selected "TCS" Scrip
    And User Click Market then Limit
    And User Select Qty "2"
    And User Click Basket Icon
    And User Choose Basket "TESTING"
    And User Navigate to Basket and Click My Baskets 
    And User Click Place Order for Particular "TESTING" Baskets
    And User Execute following orders
    
    
    

    
    