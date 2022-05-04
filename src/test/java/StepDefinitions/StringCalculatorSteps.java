package StepDefinitions;

import java.util.List;

import com.exercise.CountResult;
import com.exercise.Main;
import com.exercise.VowelCounter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StringCalculatorSteps {
	private VowelCounter counter;
	private List<CountResult> resultVowel;

@Given("i enter a {string}")
public void i_enter_a(String[] args) {
	counter = new VowelCounter();
     resultVowel = counter.getVowelListWithCount(args);
}

@When("vowels get calculated")
public void vowels_get_calculated() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the number of vowels should be calculated")
public void the_number_of_vowels_should_be_calculated() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("consonants get calculated")
public void consonants_get_calculated() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the number of consonants should be calculated")
public void the_number_of_consonants_should_be_calculated() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
