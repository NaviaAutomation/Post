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
    
    #
#Scenario: Check Buy Back    
    #When Navigate to home page 
    #And User Verify Buy Back Page
    
    
Scenario: Check add Basket    
    When Navigate to home page 
    And User click the search box
    When User Search "BSE","TCS" Scrip add in MarketWatch
    And User Click Basket
    And User add basket
    And Enter Basketname "Testing", description "Testing Purpose" and click add
    
#Scenario: Check Place basket in scrip
    #
    #When Navigate to home page 
    #And User mouse the scrip Selected "TCS" 
    #And User Click the Buy scrip for Selected "TCS" Scrip
    #And User Click Market then Limit
    #And User Select Qty "2"
    #And User Click Basket Icon
    #And User Choose Basket "TESTING"
    #And User Navigate to Basket and Click My Baskets 
    #And User Click Place Order for Particular "TESTING" Baskets
    #And User Execute following orders
    #When Navigate to home page  
    #And User click the search box
    #And User Search any "tcs" Script
    #And User Mouse Over and Add a Script
    #And User MouseOver Dashboard and Click Tools
    #And User Click Basket
    #And User add basket
    #And Enter Basketname "TESTING", description "Testing Purpose" and click add
    #And User Navigate to Dashboard
    #And User mouse the scrip Selected "TCS" 
    #And User Click the Buy scrip for Selected "TCS" Scrip
    #And User Click Market then Limit
    #And User Select Qty "2"
    #And User Click Basket Icon
    #And User Choose Basket "TESTING"
    #And User Navigate to Basket and Click My Baskets 
    #And User Click Place Order for Particular "TESTING" Baskets
    #And User Execute following orders
    #
    #
    

    
    