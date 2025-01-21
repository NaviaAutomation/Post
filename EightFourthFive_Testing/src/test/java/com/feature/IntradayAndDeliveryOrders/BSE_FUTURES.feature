Feature: Verify Intraday Market and Delivery for BSE Futures


#Scenario: Login Navia
    #Given User Navigate to Navia 
    #When User Click login with client code
    #And User Enter Client Code
    #And User  Enter Password
    #And User Click Agree CheckBox
    #And User Click Login button
    #And User Click Otp Verification and enter manualy
    #And User Click Login Again
    #
    
Scenario: User Verify the Order Placing of BSE Futures Delivery Limit

When User Search "BSE","SENSEX SEP FUT" ,"SENSEX24SEPFUT" Scrip and click Futures add in MarketWatch
And User mouseover "BSE","SENSEX24SEPFUT" Scrip and click buy button
And User Select "Delivery / Carry forward " and Choose "Limit" and click Buy Order
And User Click Order Confirmation and Check Order Placed or Insufficient fund


Scenario: User Verify the Order Placing of BSE Futures Delivery Market

When User Search "BSE","SENSEX SEP FUT" ,"SENSEX24SEPFUT" Scrip and click Futures add in MarketWatch
And User mouseover "BSE","SENSEX24SEPFUT" Scrip and click buy button
And User Select "Delivery / Carry forward " and Choose "Market" and click Buy Order
And User Click Order Confirmation and Check Order Placed or Insufficient fund

