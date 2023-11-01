package co.com.choucair.certification.ProyectoBase.tasks;

import co.com.choucair.certification.ProyectoBase.userinterface.MedilappPacientePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Menu implements Task {

    public static Menu Crearpaciente() {
        return Tasks.instrumented(Menu.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MedilappPacientePage.BTN_DESPLEGAR_PACIENTE),
                Click.on(MedilappPacientePage.BTN_CREAR_PACIENTE));
    }
}
