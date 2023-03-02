Feature: Menu
  @men
  Scenario: Verify Menu
    Given The user login page
    And The user enter "posmanager10@info.com" and "posmanager"
    And The user verify "Odoo"
    When The user see following options
      | Discuss       |
      | Calendar      |
      | Notes         |
      | Contacts      |
      | CRM           |
      | Sales         |
      | Website       |
      | Point of Sale |
      | Purchases     |
      | Inventory     |
      | Manufacturing |
      | Repairs       |
      | Project       |
      | Events        |
      | Surveys       |
      | Employees     |
      | Attendances   |
      | Leaves        |
      | Expenses      |
      | Maintenance   |
      | Fleet         |
      | Dashboards    |
 @sales
  Scenario: Sales Checkbox
    Given The user login page
    And The user enter "posmanager10@info.com" and "posmanager"
    And The user verify "Odoo"
    When The user click to sales
   Then The user click to import

   Scenario: Calendar Button
     Given The user login page
     And The user enter "posmanager10@info.com" and "posmanager"
     When The user click to "Calendar"
     Then The user click to list


