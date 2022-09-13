@stories
Feature: uTest
  As user, I want to open in the browser the uTest web page and fill out the registration form for a new user


  Scenario: Verify the new user registration successfully

    Given The user is on the web page

    When The user fills out the form with all the required information
      | firstName | lastName | email          | cdPostal | city     | country  | createKey     |
      | Victor    | Loaiza   | cvsv@gmail.com | 055421   | Envigado | Colombia | Victorlb0896* |

    Then Verify that the user was created successfully

      | validar        |
      | The last step |