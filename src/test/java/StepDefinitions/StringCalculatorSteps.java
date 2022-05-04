package StepDefinitions;

import java.util.List;

import com.exercise.CountResult;
import com.exercise.VowelCounter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StringCalculatorSteps {
	private VowelCounter counter;
	private List<CountResult> resultVowel;
	private String[] myStringArray;
@Given("i enter a (.*)$")
public void i_enter_a(String string) {
	
	myStringArray = new String[]{string};
	counter = new VowelCounter();     
}

@When("vowels get calculated")
public void vowels_get_calculated() {
	resultVowel = counter.getVowelListWithCount(myStringArray);
}

@Then("the number of vowels should be calculated")
public void the_number_of_vowels_should_be_calculated() {
	resultVowel.contains(myStringArray);
}

@When("consonants get calculated")
public void consonants_get_calculated() {
	resultVowel = counter.getVowelListWithCount(myStringArray);
}

@Then("the number of consonants should be calculated")
public void the_number_of_consonants_should_be_calculated() {
	resultVowel.contains(myStringArray);
	
	//System.out.println(resultVowel);
	

}

}
