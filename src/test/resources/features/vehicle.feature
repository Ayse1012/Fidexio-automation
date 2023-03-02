Feature: Vehicle
 @veh
  Scenario: Verify Vehicle
    Given The user login page
    And The user enter "posmanager10@info.com" and "posmanager"
    When The user click "Fleet"
    Then The user see following option
      | Vehicles               |
      | Vehicles Odometer      |
      | Vehicles Contracts     |
      | Vehicles Fuel Logs     |
      | Vehicles Services Logs |