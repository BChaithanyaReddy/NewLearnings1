Feature: Validating the functionality of Amazon

  @DESKTOP
  Scenario: User visits Amazon application
    Given I am on Amazon application
    When I move to cart
    Then User should see You cart is empty

  @DESKTOP
  Scenario: User adds product into the cart
    Given User is on empty cart page
    When User searchs for the products from search bar
    And User adds the "Iphone 156" product in the cart
    Then User should see product added into the cart