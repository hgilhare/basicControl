Feature: verify basic control page
@Reg
Scenario: filling all detail and checking

Then enter the first and last name
Then select the gender
Given select language
And enter email and password
Then click register button
Then validate succesful register

