package net.masterthought;

import cucumber.api.java.en.Given;

public class FirstSteps {
    @Given("^I am happy$")
    public void I_am_happy() throws Throwable {
       System.out.println("I'm happy");
    }
}
