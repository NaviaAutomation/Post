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
    And Select the "navi flexi cap fund direct growth" Mutual Fund
    And User Select UPI Payment
    And User enter UPI ID "venketsmart4848@okhdfcbank" and Click Pay Via UPI
    And User Pay or Decline the Payment
    #And User go to Watchlist and Delete "navi flexi cap fund direct growth"
    #When Navigate to home page 
    #And User MouseOver Dashboard and Click Mutual Funds
    #And User click Explore and Search "NAVI FLEXI CAP FUND DIRECT PLAN GROWTH"
    #And User Add to WatchList
    #And Verify in Watchlist
    #And Select the "navi flexi cap fund direct growth" Mutual Fund
    #And User Select UPI Payment
    #And User enter UPI ID "venketsmart4848@okhdfcbank" and Click Pay Via UPI
    #And User Pay or Decline the Payment 
   # And User Select Net Banking and click Pay Via Net Banking
   # And User Again go to Watchlist and Delete "navi flexi cap fund direct growth"
    #When Navigate to home page 
    #And User MouseOver Dashboard and click IPO/NFO and Click
    #And User Select Current IPO and Click Apply
    #And User enter UPI ID , Category , Quantity (Lots) , BID Options and Price Cut 
    #And User Click Agree and Click Submit
    #And User Clik Yes For IPO Amount Payable
    
    
    
    
    
    
    
    
    
    
    
    