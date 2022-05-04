Feature: As a user I want to be able to add a list of strings and see the number of vowels in each strings

  Scenario Outline: Add the list of strings and output the number vowels
    Given i enter a <string>
    When vowels get calculated
    Then the number of vowels should be calculated
    
    Examples:
    |string|
    |look  |
    |tree  |
    |space |
    |spoon |
    

  Scenario Outline: Add the list of strings and output the number consonants
    Given i enter a <string>
    When consonants get calculated
    Then the number of consonants should be calculated
 Examples:
    |string|
    |look  |
    |tree  |
    |space |
    |spoon |