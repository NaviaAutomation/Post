Feature: Dashboard Tools Functionality

Scenario: Verify Login

    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Login Again

#Scenario: Verify World Market
#
    #And User MouseOver Dashboard and Click Tools
    #And User Click World Market
    #And User Select world indices , commodities ,  forex or crypto "Forex"
    #And User Choose 1day , 1month , 3month , 1year , 5year or All "5Y"
    #
    #
#
 #Scenario: Verify Trusted Partners
    #
    #And User MouseOver Dashboard and Click Tools
    #And User Click Tools "partner"
    #And User Scroll Down and Up
    #And User Verify Shown All API Partners
    #And User Click Algo-Bridge Verify 
    #And User Click BackTesting and Verify
    #And User Click Community and Verify
    #And User Click Low Code and No Code and Verify
    #And User Click Paper Trading and Verify
    #And User Click Trading and Verify
    #And User Click Other and Verify
    #
#Scenario: Verify Margin Calculator
    #
    #And User MouseOver Dashboard and Click Tools
    #And User Click Tools "margin_calculator"
    #And User Select Exchange "MCXFO"
    #And User enter net quantity "50"
    #And User Select Buy or Sell "SELL"
    #And User Click Add
    #And Again User Select Exchange "BSEFO"
    #And Again User enter net quantity "50"
    #And Again User Select Buy or Sell "BUY"
    #And Again User Click Add
    #And Verify Initial Margin , Exposure margin and Net Premium is equal to total Amount Required
    #
#Scenario: Verify API
#
    #And User MouseOver Dashboard and Click Tools
    #And User Click Tools "api"   
    #And User Scroll Down to FAQs 
    #And User click Plus One by One 
 

    
Scenario: Verify Blogs
    And User MouseOver Dashboard and Click Tools   
    And User Click Tools "blog" 
    And User Verify Blog Page Loading

    
Scenario: Verify Ban List
    
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "ban_list"
    And User getting Securities in Ban Data
    And User Click Possible Entrance
    And User Click Possible Exits
    And User Search Symbols "BPCL" 
    And User Click Clear in Search Symbols
    And User Click All and getting data of stock , Previous and Current
    
 