Feature: add_to_Cart feature
  @Scenario1
  Scenario Outline: Login Scenario
    Given User is on Login page
    When Enter Correct "<username>" and Correct "<password>"
    Then user should be successfully logged in
    Examples:
      |username | password|
      |John     | john123 |
      |bill     | bll123  |



  @Scenario2
  Scenario Outline: Add one quantity to Cart
    Given I am on the store page
    When I add a "<product_name>" to the cart
    Then I see 1 '<product_name>' added in the cart
    Examples:
    |product_name |
    |Blue Shoes   |
    |Red Shoes    |

  @Scenario3
  Scenario Outline: Add one quantity to Cart
    Given I am on the product page
    When I add a "<product_name>" to the cart
    Then I see 2 '<product_name>' added in the cart
    Examples:
      |product_name |
      |Yellow Shoes |
      |Green Shoes  |


































