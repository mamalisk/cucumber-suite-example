package net.masterthought;

import cucumber.api.java.en.Given;

public class SecondSteps {
    @Given("^I am sad$")
    public void I_am_sad() throws Throwable {
        System.out.println("I am sad");
    }
}
