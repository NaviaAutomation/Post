Feature: Home Page Invest and Trade on Stock exchanges Functionality 

Scenario: Login Navia
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Otp Verification and enter manualy
    And User Click Login Again

Scenario: User Check Equities

When User Click Equities
And User mouse over stock name and change to ascending order
And User Take a first stock name and LPT Value in equities
When User Click Equities
And User mouse over stock name and change to ascending order
And User Click Losers  
And User Take a first stock name and LPT Value in equities 
When User Click Equities
And User mouse over stock name and change to ascending order
And User Click By Value
And User Take a first stock name and LPT Value in equities
When User Click Equities
And User mouse over stock name and change to ascending order
And User Click By Volume
And User Take a first stock name and LPT Value in equities
When User Click Equities
And User mouse over stock name and change to ascending order
And User Click Only Buyers
And User Click Only Sellers

#Scenario: User Check Options
#
#When Navigate to home page
#When User Click Options
#And User mouse over stock name and change to ascending order
#And User Take a first stock name and LPT Value in options
#When User Click Options
#And User mouse over stock name and change to ascending order
#When User Click Losers
#And User Take a first stock name and LPT Value in options
#When User Click Options
#And User mouse over stock name and change to ascending order
#When User Click OI Gainers
#And User Take a first stock name and LPT Value in options
#When User Click Options
#And User mouse over stock name and change to ascending order
#When User Click OI Losers
#And User Take a first stock name and LPT Value in options


#Scenario: User Check Futures
#
#When Navigate to home page
#When User Click Futures in dashboard
#And User mouse over stock name and change to ascending order
#And User Take a first stock name and LPT Value in Futures
#When User Click Futures in dashboard
#And User mouse over stock name and change to ascending order
#When User Click Losers
#And User Take a first stock name and LPT Value in Futures
#When User Click Futures in dashboard
#And User mouse over stock name and change to ascending order
#When User Click OI Gainers
#And User Take a first stock name and LPT Value in Futures
#When User Click Futures in dashboard
#And User mouse over stock name and change to ascending order
#When User Click OI Losers
#And User Take a first stock name and LPT Value in Futures
#
#Scenario: User Check Commodities 
#
#When Navigate to home page
#When User Click Commodities in dashboard
#And User Take a first stock name and LPT Value in Commodities
#When Navigate to home page
#When User Click Commodities in dashboard
#And User Take a first stock name and LPT Value in Commodities Options



