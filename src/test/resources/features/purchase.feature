Feature: Purchase products on demoblaze

    Scenario: Purchase two products
        Given The user is on the demoblaze home page
        When The user adds two products to the cart
        And The user views the cart
        And The user clicks on Place Order
        And The user completes the purchase form
        Then The user should see a purchase confirmation
