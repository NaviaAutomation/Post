Feature: Verify Mutual Fund Functionality

Scenario: Login Navia
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Otp Verification and enter manualy
    And User Click Login Again
    And User MouseOver Dashboard and Click Mutual Funds
    And User click Explore and Search "NAVI FLEXI CAP FUND DIRECT PLAN GROWTH"
    And User Add to WatchList
    And Verify in Watchlist
    And Select the "NAVI FLEXI CAP FUND DIRECT PLAN GROWTH" Mutual Fund
    And User Select UPI Payment
    And User enter UPI ID "9585191834@ybl" and Click Pay Via UPI
    And User Pay or Decline the Payment
    And User go to Watchlist and Delete "NAVI FLEXI CAP FUND DIRECT PLAN GROWTH"
    When Navigate to home page 
    And User MouseOver Dashboard and Click Mutual Funds
    And User click Explore and Search "NAVI FLEXI CAP FUND DIRECT PLAN GROWTH"
    And User Add to WatchList
    And Verify in Watchlist
    And Select the "NAVI FLEXI CAP FUND DIRECT PLAN GROWTH" Mutual Fund
    And User Select UPI Payment
    And User enter UPI ID "9585191834@ybl" and Click Pay Via UPI
    And User Pay or Decline the Payment 
    And User Select Net Banking and click Pay Via Net Banking
    And User Again go to Watchlist and Delete "NAVI FLEXI CAP FUND DIRECT PLAN GROWTH"
    
 
 Scenario: Login Navia
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Otp Verification and enter manualy
    And User Click Login Again
    And User MouseOver Dashboard and Click Mutual Funds   
    And User Click Explore
    And User Search "Navi Flexi Cap Fund Direct Plan Growth" in Serach Box and enter
    And User Click One Time , enter amount "10" and click pay now
    And User Click enter UPI ID "9585191834@ybl" and Click Pay Via UPI
    And User Again Click One time enter amount "10" and click pay now
    And User Click Pay via Netbanking and verify
    
    
    
    
    
    
    
    
    
    
    