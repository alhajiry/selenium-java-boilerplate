Feature: Moneylion Test

  @test
  Scenario: Verify when accessing career page
    Given I am a new customer
    When I access the MoneyLion website
    And I hover on 'About us' and click on 'Careers' at the bottom of the webpage
    Then I should redirected to MoneyLion's careers page
    And I should be able to see 'whereWeWorkSiblingElement' displayed next to 'cityGridContainerSiblingElement'
    And I should be able to see 'whereWeWorkText' displayed next to 'cityGridContainer' according to coordinate
