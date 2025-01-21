Feature: Guest Login Page

Scenario: User Login to Guest Id

Given  User Launch The Url
When  User Click The Login As Guest button
And  User Click The Name 
And  User Click The Email
And  User Click The MobileNumber
And  User Click The Agree Icon
And  User Click The Login button in Guest login button
Then  Next Page Shown

When User Send The Mobile Otp and Verification 
And  User Click The Login button
Then  Next Page Shown

#Scenario: User Change Theme
#
#When User Click The Profile 
#And  User Click The "Light" Theme button


Scenario: User Select Charts and Check Minutes Functionality

When User Click Dropdown
And User Mouseover "Nifty 50" Click the Chart
And User Navigate to Frame for Charts
And User Click Minutes "5 minutes" 
And User Click Minutes "15 minutes"
And User Click Minutes "30 minutes"
And User Click Minutes "1 hour" 
And User Click Minutes "4 hours"
And User Click Minutes "1 day"
And User Click Minutes "1 week"
And User Click Minutes "1 month"
And User Come out of the Frame
And User Close the Charts

Scenario: Check Bar chart Functionality
When Navigate to home page Guest User
When User Click Dropdown
And User Mouseover "Nifty 50" Click the Chart
And User Navigate to Frame for Charts
And User Click Bar Charts
And User Select "Bars" and Check
And User Come out of the Frame 
And User Close the Charts
When User Click Dropdown
And User Mouseover "Nifty 50" Click the Chart
And User Navigate to Frame for Charts
And User Click Bar Charts
And User Select "Candles" and Check 
And User Come out of the Frame
And User Close the Charts
When User Click Dropdown
And User Mouseover "Nifty 50" Click the Chart
And User Navigate to Frame for Charts
And User Click Bar Charts
And User Select "Hollow candles" and Check 
And User Come out of the Frame
And User Close the Charts


