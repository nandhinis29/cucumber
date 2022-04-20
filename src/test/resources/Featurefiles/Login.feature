
Feature: To validate Login functionality of facebook Application

Scenario: To validate Login using Invalid username and invalid password
When user have to enter Invalid username and invalid password
| username | nandhini |
| email | selenium123@gmail.com |
| password |978887525 |
And User Click login button
Then User should be in invalid Credentials page


Scenario: To validate Login using invalid username and valid password
When user have to enter Invalid username and valid password
| username | email | password |
| selenium | selenium123@gmail.com | 9788875325 |
| java | java213@gmail.cpm | 9876867657 |
And User Click login button
Then User should be in invalid Credentials page


