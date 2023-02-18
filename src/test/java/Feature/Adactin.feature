Feature: This feature is to test Adactin application

  @SmokeTest
  Scenario: This scenario is to test Adactin Login page
    Given user enters valid login page url of Adactin application
    When user enters valid username "ChandrooShiv" and password "Chandru"
    Then user validates entered username and password
    And user clicks login button
    Then user moves to Adactin Search Hotel page

  @SmokeTest
  Scenario: This scenario is to test Adactin Search Hotel page
    When user selects hotel location
    And user selects hotel
    And user selects room type
    And user selects number of rooms
    And user enters check in date
    And user enters check out date
    And user selects adults per room
    And user selects children per room
    And user clicks search button
    Then user moves to Select Hotel page

  @SmokeTest
  Scenario: This scenario is to test Adactin Select Hotel page
    When user click radio button
    And user clicks continue button
    Then user moves to Book Hotel page

  @SmokeTest
  Scenario: This scenario is to test Adactin Book Hotel page
    When user enters first name "Chandrasekar" and lastname "Sankar"
    And user enters billing address "143, Dubai Main Road, Dubai"
    And user enters credit card no. "4444333322221111"
    And user selects credit card type
    And user selects credit card expiry month and credit card expiry year
    And user enters cvv no. "123"
    And user clicks book now button
    Then user moves to Booking Confirm page

  @SmokeTest
  Scenario: This scenario is to test Adactin Booking Confirm page
    When user clicks my itenerary button
    Then user moves to Booked itenarary page

  @SmokeTest
  Scenario: This scenario is to test Adactin Booked itinarary page
    When user clicks logout button
    Then user should have logged out of Adactin hotel application
