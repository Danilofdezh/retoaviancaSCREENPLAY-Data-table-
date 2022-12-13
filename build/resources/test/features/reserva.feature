Feature: booking
  I as a user, I need to book a flight

  Scenario: successful booking
    Given the user enters the avianca website
    When the user registers his data
    |numeroreserva|apellidospasajero|
    |123457      |Pacheco      |
    Then successful query