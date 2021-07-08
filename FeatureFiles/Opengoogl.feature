Feature: This is to test google search

    Scenario: Google Search scenario
    Given user is searching the google URL
    When user is typing the search term "Selenium"
    And user enters the enter key
    Then user should see the search result
