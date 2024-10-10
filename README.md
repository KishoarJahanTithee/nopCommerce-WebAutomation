Automated an e-commerce website by covering two features in two different test files Registration and PlaceOrder.

Here is the website Link: nopCommerce


@registration
Feature: Nopcommerce registration feature Test

  @test-1
  Scenario Outline:
    User should be able to registration new account successfully
    Given User go to the NopCommerce Home page
    And User navigate to the Registration page
    When User select the <type> as gender
    And User set first name and last name
    And User set <dob> as date of birth
    And User set <dynamicEmail> as email
    And User set <companyName> as company details
    And User set Newsletter option as <status>
    And User set <password> as password and confirm password again
    And User click on the Register button
    Then Verify that the new account registration message <msg> is displayed


@placeOrder
Feature: Nopcommerce place order feature Test

  @test-2
  Scenario Outline:
    User should be able to successfully place order as a guest user
    Given User go to the NopCommerce Home page
    When User click "Cell phones" option from "Electronics" category
    And User click on the "Nokia Lumia 1020" for product details
    And User set the quantity number 2 in the quantity field
    And User click on the "ADD TO CART" button
    And User go to the shipping cart page
    And User accept terms conditions and click checkout button
    And User click checkout as guest button
    And User input all the billing details and click continue
    And User select shipping method "Next Day Air" and click continue
    And User select payment method "Credit Card" and click continue
    And User select "Visa" card and input card information
    And User click confirm button to place the order
    Then Verify that the order place message "Your order has been successfully processed!" is displayed



Additional things to be mentioned:
  This project is capable of running on different OS platforms.
  Used any Selenium framework.
  Followed Page Object Modal(POM) design pattern.
  Used test reporting tool ‘Allure’.
  Used ‘Faker’ for random data generation.
