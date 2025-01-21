Feature: Mobile Verification Positive and Negative 

Scenario: Login with invalid mobile number, Already Linked mobile number , with number blank Verify 

Given User Launch Url
When User enter mobile number "3674384636146314" and Navigate
Then Verify the Please enter valid mobile number error popup
When User enter mobile number "" and Navigate
Then Verify the Please enter mobile number error popup
When User enter mobile number "6383265010" and Navigate
Then Verify the Already Linked Account Popup




