package com.globalRelay.step_definitions;

import com.globalRelay.pages.GlobalRelayHomePage;
import com.globalRelay.pages.GlobalRelayLoginPage;
import com.globalRelay.utilities.BrowserUtilities;
import com.globalRelay.utilities.ConfigurationReader;
import com.globalRelay.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginFunctionality_StepDefinition {

    GlobalRelayHomePage globalRelayHomePage = new GlobalRelayHomePage();
    GlobalRelayLoginPage globalRelayLoginPage = new GlobalRelayLoginPage();

    @Given("user on globalRelay home page")
    public void user_on_global_relay_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("GlobalRelayHomePageUrl"));
    }
    @When("user click on Login button")
    public void user_click_on_login_button() {

        globalRelayHomePage.LoginBtn.click();
    }
    @Then("user should be able to move to login page and see Login ID input box")
    public void user_should_be_able_to_move_to_login_page_and_see_login_id_input_box() {

        String targetTitle ="General Authentication Service - Global Relay Archive & Compliance Reviewer";

        BrowserUtilities.switchToWindow(targetTitle);

        Assert.assertTrue("Login input box does not display",globalRelayLoginPage.LoginID_InputBox.isDisplayed());

        globalRelayLoginPage.LoginID_InputBox.sendKeys("Sorry I don't have a valid account");




    }
}
