package com.zeroBank.stepDefs;

import com.zeroBank.pages.HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Home_StepDefs {
    HomePage homePage=new HomePage();

    @Then("The user should be able to see own name: {string} on the home page")
    public void theUserShouldBeAbleToSeeOwnNameOnTheHomePage(String username) {
        String actualUsername = homePage.getUserNameText();
        String expectedUsername=username;
        Assert.assertEquals(expectedUsername,actualUsername);
    }
}
