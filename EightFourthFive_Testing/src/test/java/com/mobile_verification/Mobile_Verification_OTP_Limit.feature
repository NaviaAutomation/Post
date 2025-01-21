Feature: Otp Limit Check

Scenario: Enter invalid otp more than three times check limit Reached
Given User Launch Url
When User enter mobile number "7358302581" and Navigate
When User Invalid Otp "1234"
