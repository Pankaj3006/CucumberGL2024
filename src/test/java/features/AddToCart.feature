Feature: add_to_Cart feature

  @Scenario4
  Scenario Outline: Add one quantity to Cart
    Given Open store page
    When Add a <product_name> to the cart
    Then I should see 1 <product_name> added in the cart
    Examples:
      |product_name |
      |Blue Shoes   |