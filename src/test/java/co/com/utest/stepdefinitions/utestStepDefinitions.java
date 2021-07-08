package co.com.utest.stepdefinitions;

import co.com.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class utestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^miguel registered personal data$")
    public void miguelRegisteredPersonalData() {
        OnStage.theActorCalled("Miguel").attemptsTo(OpenUp.thePage(), (UserData.onThePage()));
    }

    @Then("^I register the Location$")
    public void iRegisterTheLocation() {
        OnStage.theActorInTheSpotlight().attemptsTo(Location.onThePage());
    }

    @Then("^I register the devices$")
    public void iRegisterTheDevices() {
        OnStage.theActorInTheSpotlight().attemptsTo(Devices.onThePage());

    }

    @When("^I click to confirm$")
    public void iClickToConfirm() {
        OnStage.theActorInTheSpotlight().attemptsTo(Confirm.onThePage());
    }

}
