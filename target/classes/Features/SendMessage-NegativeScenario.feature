Feature: Send Message - Negative Scenario

  Background:
    Given I am on the home page
    And Verify navigation link is present
    When Click on navigation link
    Then Page URL should be "https://ultimateqa.com/consulting/"

  Scenario: Negative Scenario - Cannot send a message with invalid data (incorrect email format)

    Given I am on Consulting page
    When Fill all required fields with wrong email format
    And Pass captcha
    And Click the "Send Message" button
    Then I see validation message for email

  Scenario: Negative Scenario - Cannot send a message without Name

    Given I am on Consulting page
    When Fill all required fields without Name
    And Pass captcha
    And Click the "Send Message" button
    Then I see validation message for name