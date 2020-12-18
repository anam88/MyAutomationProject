package com.myapp.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {


    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("User is on the landing page");
    }

    @When("user enter credentials")
    public void user_enter_credentials() {
        System.out.println("User enters credentials");
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        System.out.println("User click login button");
    }
    @Then("user suppose to see Welcome message")
    public void user_suppose_to_see_welcome_message() {
        System.out.println("User see the Welcome message");
    }

}
