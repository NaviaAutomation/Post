Feature: Verify Intraday Market and Delivery for BSE Equity

Scenario: Login Navia
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Otp Verification and enter manualy
    And User Click Login Again
    
    
Scenario: User Verify the Order Placing of BSE Intraday Limit

When User Search "BSE","POWERGRID" Scrip add in MarketWatch
And User mouseover "BSE","POWERGRID" Scrip and click buy button
And User Select "Intraday " and Choose "Limit" and click Buy Order
And User Click Order Confirmation and Check Order Placed or Insufficient fund

Scenario: User Verify the Order Placing of BSE Intraday Market 

When User Search "BSE","INVENTURE" Scrip add in MarketWatch
And User mouseover "BSE","INVENTURE" Scrip and click buy button
And User Select "Intraday " and Choose "Market" and click Buy Order
And User Click Order Confirmation and Check Order Placed or Insufficient fund

#Scenario: User Verify the Order Placing of BSE Intraday Stop Loss 
#
#When User Search "BSE","TCS" Scrip add in MarketWatch
#And User mouseover "BSE","TCS" Scrip and click buy button
#And User Select "Intraday " and Choose "Stop Loss" and click Buy Order
#And User Enter Trigger Price "00" and Click Buy
#And User Click Order Confirmation and Check Order Placed or Insufficient fund
#
#
#Scenario: User Verify the Order Placing of BSE Intraday Stop Loss 
#
#When User Search "BSE","JIOFIN" Scrip add in MarketWatch
#And User mouseover "BSE","JIOFIN" Scrip and click buy button
#And User Select "Intraday " and Choose "Stop Loss - Market" and click Buy Order
#And User Enter Trigger Price "00" and Click Buy
#And User Click Order Confirmation and Check Order Placed or Insufficient fund


Scenario: User Verify the Order Placing of BSE Delivery Limit

When User Search "BSE","DUCON" Scrip add in MarketWatch
And User mouseover "BSE","DUCON" Scrip and click buy button
And User Select "Delivery / Carry forward " and Choose "Limit" and click Buy Order
And User Click Order Confirmation and Check Order Placed or Insufficient fund

Scenario: User Verify the Order Placing of BSE Delivery Market 

When User Search "BSE","SUZLON" Scrip add in MarketWatch
And User mouseover "BSE","SUZLON" Scrip and click buy button
And User Select "Delivery / Carry forward " and Choose "Market" and click Buy Order
And User Click Order Confirmation and Check Order Placed or Insufficient fund
When Navigate to home page 


#Scenario: User Verify the Order Placing of BSE Delivery Stop Loss 
#
#When User Search "BSE","TCS" Scrip add in MarketWatch
#And User mouseover "BSE","TCS" Scrip and click buy button
#And User Select "Intraday " and Choose "Stop Loss" and click Buy Order
#And User Enter Trigger Price "00" and Click Buy
#And User Click Order Confirmation and Check Order Placed or Insufficient fund
#
#
#Scenario: User Verify the Order Placing of BSE Delivery Stop Loss 
#
#When User Search "BSE","JIOFIN" Scrip add in MarketWatch
#And User mouseover "BSE","JIOFIN" Scrip and click buy button
#And User Select "Intraday " and Choose "Stop Loss - Market" and click Buy Order
#And User Enter Trigger Price "00" and Click Buy
#And User Click Order Confirmation and Check Order Placed or Insufficient fund