#Language : en
 ## Author: Jenny Alejandra Barbosa Pardo - jbarbosa@todo1.net

Feature: Purchase
  As user I want to purchase an item on sauce demo page


  Background: Login Successfully
    Given I am on sauce demo page
    When I submit username and password
    Then I should be logged in


  Scenario: Purchase Successfully
    Given I go to chart
    When I complete the fields
    Then I validate the message "THANK YOU FOR YOUR ORDER"