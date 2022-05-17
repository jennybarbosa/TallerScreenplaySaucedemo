package com.saucedemo.testing.stepdefinitions;

import com.saucedemo.testing.questions.VerifyLoginQuestion;
import com.saucedemo.testing.questions.VerifyPurchaseQuestion;
import com.saucedemo.testing.tasks.CheckOutTask;
import com.saucedemo.testing.tasks.LogInTask;
import com.saucedemo.testing.tasks.OpenBrowserTask;
import com.saucedemo.testing.tasks.ChartTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class PurchaseStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver webDriver;
    private Actor userAutomation = Actor.named("userAutomation");

    @Before
    public void prepareActorStage(){
        OnStage.setTheStage(new OnlineCast());
        userAutomation.can(BrowseTheWeb.with(webDriver));

    }

    @Given("^I am on sauce demo page$")
    public void iAmOnSauceDemoPage() {
        userAutomation.attemptsTo(OpenBrowserTask.openBrowserTask());
    }

    @When("^I submit username and password$")
    public void iSubmitUsernameAndPassword() {
        userAutomation.attemptsTo(LogInTask.logInTask());
    }

    @Then("^I should be logged in$")
    public void iShouldBeLoggedIn() {
        String textValid = "PRODUCTS";
        userAutomation.should(GivenWhenThen.seeThat(VerifyLoginQuestion.verifyLoginQuestion(), Matchers.equalTo(textValid)));
    }

    @Given("^I go to chart$")
    public void iGoToChart() {
        userAutomation.attemptsTo(ChartTask.selectProductToChart());
    }

    @When("^I complete the fields$")
    public void iCompleteTheFields() {
    userAutomation.attemptsTo(CheckOutTask.doCheckOut());
    }

    @Then("^I validate the message \"([^\"]*)\"$")
    public void iValidateTheMessage(String text) {
        userAutomation.should(GivenWhenThen.seeThat(VerifyPurchaseQuestion.verifyPurchseQuestion(), Matchers.equalTo(text)));

    }


}
