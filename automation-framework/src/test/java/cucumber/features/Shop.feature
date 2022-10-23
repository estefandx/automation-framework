Feature: Search for Products
  As a user, I want to search the catalog so that I can find specific products

  Scenario: Click search result
    Given there is a product with  color PINK in the shop
    And I search for the product in the shop
    When I click in the first product in the shop
    Then I should be price to the product of 15.00


  Scenario Outline: number products
    Given there is a product <product_type> in the shop
    When I search for the product in the shop
    Then I should see more of <number_products>
    Examples:
      | product_type | number_products |
      | "black"      | 1               |
      | "pink"      | 50               |

