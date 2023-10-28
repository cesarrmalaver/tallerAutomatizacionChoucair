package co.com.choucair.certification.ProyectoBase.stepdefinitions;

import co.com.choucair.certification.ProyectoBase.model.MedilappData;
import co.com.choucair.certification.ProyectoBase.questions.Answer;
import co.com.choucair.certification.ProyectoBase.questions.AnswerLoginFallido;
import co.com.choucair.certification.ProyectoBase.tasks.Login;
import co.com.choucair.certification.ProyectoBase.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class IniciarSesionStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^quiero ingresar a medilapp$")
    public void quieroIngresarAMedilapp() {
        OnStage.theActorCalled("Choucair").wasAbleTo(OpenUp.thePage());
    }

    @When("^ingreso los datos de inicio de sesion$")
    public void ingresoLosDatosDeInicioDeSesion(List<MedilappData> medilappData) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Login.onThepage(medilappData.get(0).getStrUser(),medilappData.get(0).getStrPassword()));
    }

    @Then("^debe encontrar en la pagina principal el label$")
    public void debeEncontrarEnLaPaginaPrincipalElLabel(List<MedilappData> medilappData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(medilappData.get(0).getStrInicio())));
    }

    @Then("^debe mostrarse mensaje de error$")
    public void debeMostrarseMensajeDeError(List<MedilappData> medilappData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerLoginFallido.toThe(medilappData.get(0).getStrError())));
    }
}