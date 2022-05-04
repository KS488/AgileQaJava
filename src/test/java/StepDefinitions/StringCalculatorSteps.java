package StepDefinitions;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;

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
assertEquals(1, resultVowel.size());
assertFalse(resultVowel.isEmpty());
//assertTrue(resultVowel.contains("vowels"));
}

@When("consonants get calculated")
public void consonants_get_calculated() {
	resultVowel = counter.getVowelListWithCount(myStringArray);
}

@Then("the number of consonants should be calculated")
public void the_number_of_consonants_should_be_calculated() {

	assertEquals(1, resultVowel.size());
	assertFalse(resultVowel.isEmpty());
	//assertTrue(resultVowel.contains("consonants"));


	//System.out.println(resultVowel);
	

}

}
