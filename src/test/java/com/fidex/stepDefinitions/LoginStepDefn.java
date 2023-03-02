package com.fidex.stepDefinitions;

import com.fidex.pages.LoginPage;
import com.fidex.utilities.BrowserUtils;
import com.fidex.utilities.ConfigurationReader;
import com.fidex.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefn {
    LoginPage loginPage=new LoginPage();
    @Given("The user login page")
    public void the_user_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(2);
    }

    @When("The user enter {string} and {string}")
    public void the_user_enter_and(String email, String password) {

        loginPage.login(email,password);
        BrowserUtils.waitFor(2);
    }


    @When("The user enter {string} and {string} as a{string}")
    public void theUserEnterAndAsA(String username, String password, String usertype) {
        loginPage.login(username,password);
    }

    @Then("The user should be able to login and {string} should be")
    public void theUserShouldBeAbleToLoginAndShouldBe(String expectedTitle) {
        String actualTitle=Driver.get().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Then("The user verify {string}")
    public void theUserVerify(String expectedTitle) {
        String actualTitle=Driver.get().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}
