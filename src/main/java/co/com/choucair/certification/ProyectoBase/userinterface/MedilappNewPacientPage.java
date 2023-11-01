package co.com.choucair.certification.ProyectoBase.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MedilappNewPacientPage extends PageObject {

    public static final Target TEXTBOX_CEDULA = Target.the("Cuadro de texto para la cèdula")
            .located(By.id("txtCedula"));
    public static final Target BTN_SEXO = Target.the("Boton para seleccionar el sexo")
            .located(By.id("radioMasculino"));
    public static final Target TEXTBOX_NOMBRE = Target.the("Cuadro de texto para el nombre")
            .located(By.id("inputnombre"));
    public static final Target TEXTBOX_APELLIDO = Target.the("Cuadro de texto para el apellido")
            .located(By.id("inputapellido"));
    public static final Target TEXTBOX_FECHANACIMIENTO = Target.the("Cuadro de texto para la fecha de nacimiento")
            .located(By.id("inputfecnac"));
    public static final Target TEXTBOX_TELEFONO = Target.the("Cuadro de texto para el telefono")
            .located(By.id("inputtelefono"));
    public static final Target TEXTBOX_CORREO = Target.the("Cuadro de texto para el correo")
            .located(By.name("txtemail"));
    public static final Target TEXTBOX_COMENTARIOS = Target.the("Cuadro de texto para")
            .located(By.id("exampleFormControlTextarea1"));
    public static final Target BTN_AGREGARPACIENTE = Target.the("Boton para desplegar la lista del menú")
            .located(By.id("btnCrear"));

    public static final Target MSGBOX_PACIENTECREADO = Target.the("Mensaje confirmaciòn de creacion")
                    .located(By.xpath("/html/body/div[2]/div[2]/div/div[4]/p"));



}
