Feature: This is test the HRM page for seeing demo on datatable

Background:

 Given user is to enter the URL
 
# sending values directly and receiving it via regular expression: parameterization
   Scenario: HRM page with direct data
#    Given user is to enter the URL
     When user is to enter the uid "Admin" and pswd "Admin123"
     Then user submits
    
    
# passing data from data table with out header
# Scenario: Verifying Login operation by passing data without header
# Given  User should open Googlechrome with Url
# When User going to pass Credential given below
#    |Admin|admin123|
# Then User should click on Submit
 
 
# sending values through data table with headers
#@Runthis
   Scenario: passing data from data table with header
#     Given user is to enter the URL
     When user is to enter the below uid and pswd 
    |username|password|
    |Vani|admin123|
    Then user submits


#passing data using examples

#	Scenario Outline: Run my testcase using different data
#	Given user is going to enter the URL
#	When user is going to enter below  uid "<username>" and pwd "<password>" with examples
#
#Examples: 
#|username|password|
#|Admin|admin123|
#|admin|123|
#|admin|567|








    
