Feature: Check the Dashboard Functionalities , Statment and Reports , IPO , MF , Re-kyc , Support , Tools , Basket , Price Alert , Strategy Buikder , Analysis


Scenario: Login Navia
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Otp Verification and enter manualy
    And User Click Login Again  
    
Scenario: User Check Statements and Reports Trage Register
When User mouse over Dashboard
When User Click Statements and Reports
And User Navigate to Backoffice and Click Activity and Verify
    
#Scenario: User Check Statements and Reports Trage Register
#When User mouse over Dashboard
#When User Click Statements and Reports
#And User Navigate to Backoffice and Click Activity
#And User Open Arrow Dropdown
#And User Open Dropdown and Click Trade Register enter Scrips "63748379" , Select From date "01012025" , To date "03012025" and Select all Dropdown
#And User click View and Verify the data
#
#Scenario: User Check Statements and Check DP Holdings
#When User mouse over Dashboard
#When User Click Statements and Reports
#And User Navigate to Backoffice and Click Activity
#And User Open Arrow Dropdown
#And User Open Dropdown and Click DP Holdings
#And User click View and Verify the DP Holdings
#
#Scenario: User Check Statements and Check DP Trans
#When User mouse over Dashboard
#When User Click Statements and Reports
#And User Navigate to Backoffice and Click Activity
#And User Open Arrow Dropdown
#And User Open Dropdown and Click DP Trans
#And User click View and Verify the New DP Trans
#
#
#
#Scenario: User Check Statements and Check Positions
#When User mouse over Dashboard
#When User Click Statements and Reports
#And User Navigate to Backoffice and Click Activity
#And User Open Arrow Dropdown
#And User Open Dropdown and Click Positions
#And User click View and Verify the New Position
#
#
#Scenario: User Check Statements and Reports Share Margin
#When User mouse over Dashboard
#When User Click Statements and Reports
#And User Navigate to Backoffice and Click Activity
#And User Open Arrow Dropdown
#And User Open Dropdown and Click Colletaral
#And User click View and Verify the Margin Stock Data 
#
#
#Scenario: User Check Statement and Reports Ledger
#When User mouse over Dashboard
#When User Click Statements and Reports
#And User Navigate to Backoffice and Click Activity
#And User Open Arrow Dropdown
#And User click ledger and View Data
#
#Scenario: User Check Statement and Reports portfolio
#
#When User mouse over Dashboard
#When User Click Statements and Reports
#And User Navigate to Backoffice and Click Activity
#And User Open Arrow Dropdown
#And User click Portfolio and View Data
#
#
#Scenario: User Check Statement and Reports myinfo
#When User mouse over Dashboard
#When User Click Statements and Reports
#And User Navigate to Backoffice and Click Activity
#And User Open Arrow Dropdown
#And User click Myinfo and View Data
#
    #
#
#
#Scenario: User Check and Verify Basket
      #And Navigate to home page
      #When User mouse over Dashboard
      #And  User Click Basket 
