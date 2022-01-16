Feature: Select a Flight
  As user
  I want search a flight
  To select a flight

  Scenario Outline: Search a cheapest flight
    Given User visits a Home of Despegar
    When Selects the chapest flight <from> to <to>
    Then See checkout page

    Examples:
      |  from  |  to  |
      |Medellin|Bogota|

