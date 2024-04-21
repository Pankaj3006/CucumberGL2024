Feature: place an order
  @Scenario6
  Scenario Outline: using default payment option
    Given user on the checkout page after adding <product_name> to the cart
    When user provide billing details
    |firstname | lastname | country | address | city | state | zip | email |
    |demo      | user     | India   | sector 16-B  |Noida | Uttar Pradesh  |201306|pankajkit@emial.com|
    And user place an order
    Then user should be placed successfully place order
    Examples:
      |product_name |
      |Blue Shoes   |