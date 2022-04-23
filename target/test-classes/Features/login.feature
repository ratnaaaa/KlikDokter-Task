Feature: login


  Scenario: login successfully

    Given User open Homepage Klikdokter
    When  User Click login button
    And   User input email
    And   User click Selanjutnya button
    And   User Input OTP
    And   user click send otp button
    Then  successfully login