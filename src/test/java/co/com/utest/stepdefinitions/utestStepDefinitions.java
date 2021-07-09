package co.com.utest.stepdefinitions;

import co.com.utest.model.UtestData;
import co.com.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class utestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^miguel registered personal data$")
    public void miguelRegisteredPersonalData(List<UtestData> utestData) throws  Exception{
        OnStage.theActorCalled("Miguel").attemptsTo(OpenUp.thePage(), UserData.onThePage(
                utestData.get(0).getStrFirtName(),
                utestData.get(0).getStrLastName(),
                utestData.get(0).getStrEmail(),
                utestData.get(0).getStrBirthMonth(),
                utestData.get(0).getStrBirthDay(),
                utestData.get(0).getStrBirthYear()
        ));
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
    public void iClickToConfirm(List<UtestData> utestData) throws  Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Confirm.onThePage(
                utestData.get(0).getStrPassword(),
                utestData.get(0).getStrConfirmPassword()
        ));
    }

}
