Feature: Ecommerce user experience

  Scenario: User logs in
    Given User navigates to homepage
    When User logs in using username "admin" and password "admin"
    Then User clicks on login button

  Scenario: User selects product and checksout
    Given User is on product page
    When User selects product
    Then Proceeds to cart and checkout
