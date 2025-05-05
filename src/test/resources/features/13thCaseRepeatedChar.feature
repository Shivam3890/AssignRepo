Feature: Functionality for Longest Substring Program

  As a user of the application
  I want to be able to predict the output for valid input in case of repeated characters in a string
  So that I can check how my application program logic written

  Background:
    Given I am on the Input page of the application

    Scenario: Verify the output with normal repeated characters
      Given I have entered a string having repeated characters
      When I click on Submit button
      Then I should be able to view correct output

      Examples:
        | input        | expectedLength |
        | "abcabcbb"  | 3              |
        | "bbbbb"     | 1              |

