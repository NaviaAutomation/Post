Feature: Dashboard Tools Functionality



@all
Scenario: Verify All Tools Functionality

    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Login Again
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "World Market"
    And User Select world indices , commodities ,  forex or crypto "Forex"
    And User Choose 1day , 1month , 3month , 1year , 5year or All "5Y"
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Margin Calculator"
    And User Select Exchange "MCXFO"
    And User enter net quantity "50"
    And User Select Buy or Sell "SELL"
    And User Click Add
    And Again User Select Exchange "BSEFO"
    And Again User enter net quantity "50"
    And Again User Select Buy or Sell "BUY"
    And Again User Click Add
    And Verify Initial Margin , Exposure margin and Net Premium is equal to total Amount Required
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Trusted Partners"
    And User Scroll Down and Up
    And User Select White or Black Theme ""
    And User Verify Shown All API Partners
    And User Click Algo-Bridge Verify 
    And User Click BackTesting and Verify
    And User Click Community and Verify
    And User Click Low Code and No Code and Verify
    And User Click Paper Trading and Verify
    And User Click Trading and Verify
    And User Click Other and Verify
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "API"   
    And User Scroll Down to FAQs 
    And User click Plus One by One 
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Support"   
    And User Scroll Down and up and change language english to hindi
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Demo Videos" 
    And User Scroll Down and Up Verify Navia App Demo Videos Logo
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Univ" 
    And User Select "INVESTMENT BASICS"
    And Scroll Down and up take Investment Basics Image
    And Click BackOption
    And User click tool page "ASSET CLASSES"
    And User Scroll Down and up take Asset Classes Image
    And Click BackOption
    And User click tool page "INVESTMENT VEHICLES"
    And User Scroll Down and up take Investment vehicles Image
    And Click BackOption
    And User click tool page "FUNDAMENTAL ANALYSIS"
    And User navigate to fundamental analysis page and take  fudamental analysis Image
    And Click BackOption
    And User click tool page "TECHNICAL ANALYSIS"
    And User navigate to technical analysis page and take  Technical analysis Image
    And Click BackOption
    And User click tool page "ALL ABOUT OPTION"
    And User navigate to all about option analysis page and take  All About Option Image
    And Click BackOption
    And User click tool page "PORTFOLIO & STRATEGIES"
    And User navigate to portfolio and strategies page and take  Protfolio and Strategies Image
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Result Calendar" 
    And User Click Forthcoming
    And User Click Historical
    And User Click Historical getting Stock and Date Data
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Ban List"
    And User getting Securities in Ban Data
    And User Click Possible Entrance
    And User Click Possible Exits
    And User Search Symbols "BPCL" 
    And User Click Clear in Search Symbols
    And User Click All and getting data of stock , Previous and Current
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Cross Currency"  
    And User Getting Currency Values for "INR"
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Forex Heat map"  
    And User Getting forex heat map Values for "INR"
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Global"  
    And User Verify Global Page
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Buy Back"  
    And User Verify Buy Back Page
    
@worldMarket
Scenario: Verify World Market values changes
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Login Again
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "World Market"
    And User Select world indices , commodities ,  forex or crypto "Forex"
    And User Choose 1day , 1month , 3month , 1year , 5year or All "5Y"
    And User MouseOver Dashboard and Click Tools
    
@marginCalculator  
Scenario: Verify Margin Calculator

    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Login Again
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Margin Calculator"
    And User Select Exchange "MCXFO"
    And User enter net quantity "50"
    And User Select Buy or Sell "SELL"
    And User Click Add
    And Again User Select Exchange "BSEFO"
    And Again User enter net quantity "50"
    And Again User Select Buy or Sell "BUY"
    And Again User Click Add
    And Verify Initial Margin , Exposure margin and Net Premium is equal to total Amount Required
   
    
@trustedPartners
Scenario: Verify Trusted Partners

    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Login Again
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Trusted Partners"
    And User Scroll Down and Up
    And User Select White or Black Theme ""
    And User Verify Shown All API Partners
    And User Click Algo-Bridge Verify 
    And User Click BackTesting and Verify
    And User Click Community and Verify
    And User Click Low Code and No Code and Verify
    And User Click Paper Trading and Verify
    And User Click Trading and Verify
    And User Click Other and Verify

@api
Scenario: Verify API

    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Login Again
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "API"   
    And User Scroll Down to FAQs 
    And User click Plus One by One 
 
@support  
Scenario: Verify Support

    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Login Again
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Support"   
    And User Scroll Down and up and change language english to hindi 

@demoVideos 
Scenario: Verify Demo Videos

    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Login Again
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Demo Videos" 
    And User Scroll Down and Up Verify Navia App Demo Videos Logo


@univ
Scenario: Verify Univ

    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Login Again
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Univ" 
    And User Select "INVESTMENT BASICS"
    And Scroll Down and up take Investment Basics Image
    And Click BackOption
    And User click tool page "ASSET CLASSES"
    And User Scroll Down and up take Asset Classes Image
    And Click BackOption
    And User click tool page "INVESTMENT VEHICLES"
    And User Scroll Down and up take Investment vehicles Image
    And Click BackOption
    And User click tool page "FUNDAMENTAL ANALYSIS"
    And User navigate to fundamental analysis page and take  fudamental analysis Image
    And Click BackOption
    And User click tool page "TECHNICAL ANALYSIS"
    And User navigate to technical analysis page and take  Technical analysis Image
    And Click BackOption
    And User click tool page "ALL ABOUT OPTION"
    And User navigate to all about option analysis page and take  All About Option Image
    And Click BackOption
    And User click tool page "PORTFOLIO & STRATEGIES"
    And User navigate to portfolio and strategies page and take  Protfolio and Strategies Image
    
   
@resultCalendar  
Scenario: Verify Result Calender

    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Login Again
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Result Calendar" 
    And User Click Forthcoming
    And User Click Historical
    And User Click Historical getting Stock and Date Data
 
@ban
Scenario: Verify Ban List

    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Login Again
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Ban List"
    And User getting Securities in Ban Data
    And User Click Possible Entrance
    And User Click Possible Exits
    And User Search Symbols "BPCL" 
    And User Click Clear in Search Symbols
    And User Click All and getting data of stock , Previous and Current  
    
@crossCurrency
Scenario: Verify Cross Currency

    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Login Again
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Cross Currency"  
    And User Getting Currency Values for "INR"
    
@forexHeatMap
Scenario: Verify forex heat map

    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Login Again
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Forex Heat map"  
    And User Getting forex heat map Values for "INR"
    
@global
Scenario: Verify Global

    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Login Again
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Global"  
    And User Verify Global Page
    
@buyBack
Scenario: Verify Buy Back

    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Login Again
    And User MouseOver Dashboard and Click Tools
    And User Click Tools "Buy Back"  
    And User Verify Buy Back Page
    
    