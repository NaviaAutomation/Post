Feature: Verify Intraday Market,Limit,StopLoss and StopLoss Market Place order

Scenario: Login Navia
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Otp Verification and enter manualy
    And User Click Login Again
    
Scenario: User Verify the Order Placing of NSE Intraday Limit

When User Search "NSE","HDFCBANK" Scrip add in MarketWatch
And User mouseover "NSE","HDFCBANK" Scrip and click buy button
And User Select "Intraday " and Choose "Limit" and click Buy Order
And User Click Order Confirmation and Check Order Placed or Insufficient fund

Scenario: User Verify the Order Placing of NSE Intraday Market 

When User Search "NSE","UNIONBANK" Scrip add in MarketWatch
And User mouseover "NSE","UNIONBANK" Scrip and click buy button
And User Select "Intraday " and Choose "Market" and click Buy Order
And User Click Order Confirmation and Check Order Placed or Insufficient fund

#Scenario: User Verify the Order Placing of NSE Intraday Stop Loss 
#
#When User Search "NSE","TCS" Scrip add in MarketWatch
#And User mouseover "NSE","TCS" Scrip and click buy button
#And User Select "Intraday " and Choose "Stop Loss" and click Buy Order
#And User Enter Trigger Price "00" and Click Buy
#And User Click Order Confirmation and Check Order Placed or Insufficient fund
#
#
#Scenario: User Verify the Order Placing of NSE Intraday Stop Loss 
#
#When User Search "NSE","JIOFIN" Scrip add in MarketWatch
#And User mouseover "NSE","JIOFIN" Scrip and click buy button
#And User Select "Intraday " and Choose "Stop Loss - Market" and click Buy Order
#And User Enter Trigger Price "00" and Click Buy
#And User Click Order Confirmation and Check Order Placed or Insufficient fund

Scenario: User Verify the Order Placing of NSE Delivery Limit

When User Search "NSE","IDEA" Scrip add in MarketWatch
And User mouseover "NSE","IDEA" Scrip and click buy button
And User Select "Delivery / Carry forward " and Choose "Limit" and click Buy Order
And User Click Order Confirmation and Check Order Placed or Insufficient fund

Scenario: User Verify the Order Placing of NSE Delivery Market 

When User Search "NSE","WIPRO" Scrip add in MarketWatch
And User mouseover "NSE","WIPRO" Scrip and click buy button
And User Select "Delivery / Carry forward " and Choose "Market" and click Buy Order
And User Click Order Confirmation and Check Order Placed or Insufficient fund

#Scenario: User Verify the Order Placing of NSE Delivery Stop Loss 
#
#When User Search "NSE","TCS" Scrip add in MarketWatch
#And User mouseover "NSE","TCS" Scrip and click buy button
#And User Select "Intraday " and Choose "Stop Loss" and click Buy Order
#And User Enter Trigger Price "00" and Click Buy
#And User Click Order Confirmation and Check Order Placed or Insufficient fund
#
#
#Scenario: User Verify the Order Placing of NSE Delivery Stop Loss 
#
#When User Search "NSE","JIOFIN" Scrip add in MarketWatch
#And User mouseover "NSE","JIOFIN" Scrip and click buy button
#And User Select "Intraday " and Choose "Stop Loss - Market" and click Buy Order
#And User Enter Trigger Price "00" and Click Buy
#And User Click Order Confirmation and Check Order Placed or Insufficient fund


S