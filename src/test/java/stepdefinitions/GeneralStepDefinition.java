package stepdefinitions;

import co.com.certificacion.retotecnicobanistmo.interactions.ReadPdf;
import co.com.certificacion.retotecnicobanistmo.questions.ValidateInformation;
import co.com.certificacion.retotecnicobanistmo.tasks.DownloadPDF;
import co.com.certificacion.retotecnicobanistmo.tasks.InternationalTransfer;
import co.com.certificacion.retotecnicobanistmo.utils.OwnWebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class GeneralStepDefinition {

    @Before
    public void init(){setTheStage(new Cast());}

    @Given("^the user open url application$")
    public void theUserOpenUrlApplication(){
        theActorCalled("actor").can(BrowseTheWeb.with(OwnWebDriver.nuevo().chrome("https://www.banistmo.com/wps/portal/banistmo/personas")));
    }
    @Given("^The user enter the page banistmo international transfer$")
    public void TheUserEnterThePageBanistmoInternationalTransfer() {
        OnStage.theActorInTheSpotlight().attemptsTo(InternationalTransfer.with());
    }

    @When("^select the document to download and load$")
    public void SelectTheDocumentToDownloadAndLoad() {
        OnStage.theActorInTheSpotlight().attemptsTo(DownloadPDF.pdf());
    }

    @Then("^The user validate the information (.*)$")
    public void TheUserValidateTheInformation(String msj) {
      OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateInformation.answered(msj, ReadPdf.listInformation()),Matchers.equalTo(true)));
    }
}
