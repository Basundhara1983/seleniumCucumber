Feature: Amazon Search
  Scenario: Search a product
    Given I have a search field on Amazon page
    When I search for a product with name "Apple MacBookPro" and price 1000
    Then Product with name "Apple MacBookPro" should be displayed