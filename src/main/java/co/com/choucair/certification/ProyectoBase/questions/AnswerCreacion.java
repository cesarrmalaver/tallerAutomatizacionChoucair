package co.com.choucair.certification.ProyectoBase.questions;

import co.com.choucair.certification.ProyectoBase.userinterface.MedilappNewPacientPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerCreacion implements Question<Boolean> {

    private String question;

    public AnswerCreacion(String question) { this.question = question; }

    public static AnswerCreacion exitosa(String question) {
        return new AnswerCreacion(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;

        String strCreacionCorrecta = Text.of(MedilappNewPacientPage.MSGBOX_PACIENTECREADO).viewedBy(actor).asString();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$"+strCreacionCorrecta);
        System.out.println(question);
        if (strCreacionCorrecta.contains(question)){
            result = true;
        }else result = false;

        return result;
    }

}
