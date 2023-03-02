Feature:Login

  @login
  Scenario: user should bee login
    Given The user login page
    When The user enter "posmanager10@info.com" and "posmanager"
    Then The user verify "Odoo"

