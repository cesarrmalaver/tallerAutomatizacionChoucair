package co.com.choucair.certification.ProyectoBase.tasks;

import co.com.choucair.certification.ProyectoBase.userinterface.MedilappNewPacientPage;
import co.com.choucair.certification.ProyectoBase.userinterface.MedilappPacientePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Crear implements Task {

    private String strCedula;
    private String strNombre;
    private String strApellido;
    private String strFechaNacimiento;
    private String strTelefono;
    private String strCorreo;
    private String strComentarios;

    public Crear(String strCedula, String strNombre, String strApellido, String strFechaNacimiento, String strTelefono, String strCorreo, String strComentarios) {
        this.strCedula = strCedula;
        this.strNombre = strNombre;
        this.strApellido = strApellido;
        this.strFechaNacimiento = strFechaNacimiento;
        this.strTelefono = strTelefono;
        this.strCorreo = strCorreo;
        this.strComentarios = strComentarios;
    }

    public static Crear paciente(String strCedula, String strNombre, String strApellido, String strFechaNacimiento, String strTelefono, String strCorreo, String strComentarios) {
        return Tasks.instrumented(Crear.class,strCedula, strNombre, strApellido, strFechaNacimiento, strTelefono, strCorreo, strComentarios);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strCedula).into(MedilappNewPacientPage.TEXTBOX_CEDULA),
                Click.on(MedilappNewPacientPage.BTN_SEXO),
                Enter.theValue(strNombre).into(MedilappNewPacientPage.TEXTBOX_NOMBRE),
                Enter.theValue(strApellido).into(MedilappNewPacientPage.TEXTBOX_APELLIDO),
                Enter.theValue(strFechaNacimiento).into(MedilappNewPacientPage.TEXTBOX_FECHANACIMIENTO),
                Enter.theValue(strTelefono).into(MedilappNewPacientPage.TEXTBOX_TELEFONO),
                Enter.theValue(strCorreo).into(MedilappNewPacientPage.TEXTBOX_CORREO),
                Enter.theValue(strComentarios).into(MedilappNewPacientPage.TEXTBOX_COMENTARIOS),
                Click.on(MedilappNewPacientPage.BTN_AGREGARPACIENTE));
    }
}
