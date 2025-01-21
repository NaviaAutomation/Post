Feature: Navia Web Check the features of the Chatbot

Scenario: Chat bot Check and Verify
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Otp Verification and enter manualy
    And User Click Login Again
    When Navigate to home page 
    And User Click Profit and Click Support
    Then User Verify All the Options in Chatbot
    