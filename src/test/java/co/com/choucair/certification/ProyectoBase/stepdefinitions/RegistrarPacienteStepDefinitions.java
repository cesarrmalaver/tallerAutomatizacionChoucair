package co.com.choucair.certification.ProyectoBase.stepdefinitions;

import co.com.choucair.certification.ProyectoBase.model.MedilappData;
import co.com.choucair.certification.ProyectoBase.model.MedilappNewPacients;
import co.com.choucair.certification.ProyectoBase.questions.AnswerCreacion;
import co.com.choucair.certification.ProyectoBase.tasks.Crear;
import co.com.choucair.certification.ProyectoBase.tasks.Menu;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class RegistrarPacienteStepDefinitions {

    @When("^ingreso al modulo de paciente$")
    public void ingresoAlModuloDePaciente(){
        OnStage.theActorInTheSpotlight().attemptsTo(Menu.Crearpaciente());

    }

    @Then("^Ingreso a la opcion de crear paciente paciente e ingresos los datos$")
    public void ingresoALaOpcionDeCrearPacientePacienteEIngresosLosDatos(List<MedilappNewPacients> medilappNewPacients) {
        OnStage.theActorInTheSpotlight().attemptsTo(Crear.paciente(medilappNewPacients.get(0).getStrCedula(),
                medilappNewPacients.get(0).getStrNombre(),medilappNewPacients.get(0).getStrApellido(),
                medilappNewPacients.get(0).getStrFechaNacimiento(), medilappNewPacients.get(0).getStrTelefono(),
                medilappNewPacients.get(0).getStrCorreo(), medilappNewPacients.get(0).getStrComentarios()));
    }


    @Then("^se debe mostrar un mensaje de creacion exitosa$")
    public void seDebeMostrarUnMensajeDeCreacionExitosa(List <MedilappNewPacients> medilappNewPacients) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerCreacion.exitosa(medilappNewPacients.get(0).getStrRegistroCorrecto())));

    }
}
