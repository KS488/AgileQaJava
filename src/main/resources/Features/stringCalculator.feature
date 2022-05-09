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
  
#Other Scenarios 
   #1)Add the list of stings containing no vowels
   #2)Add the list strings contain no consonants
   #3)Add the list of string contain all vowels
   #4)Add a list of non strings Data types  i.e int, bool ensure error logged correctly if !isListOfStrings
   #5)Add each string in the order they are keyed in and output it

   # Question 
     # the Second acceptance criteria states ' I should be able to add up to 4 strings at once'
         # does thise mean no more than 4 strings or a min of 4 strings 
   
   # Scenarion based on the above question 
   #6)Add the list of 4 or more strings and output the number vowels/consonants
   #7)Add the list of maximum of 4  strings and output the number of vowels/consonants and ensure error logged correctly if !isLengthGreaterThanFour

