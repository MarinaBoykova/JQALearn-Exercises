Feature: Send Message

  Background:
    Given I am on the home page
    And Verify navigation link is present
    When Click on navigation link
    Then Page URL should be "https://ultimateqa.com/consulting/"

  Scenario: Send a successful message

    Given I am on Consulting page
    When Fill all required fields for a message
    And Pass captcha
    And Click the "Send Message" button
    Then I see message sent successfully
