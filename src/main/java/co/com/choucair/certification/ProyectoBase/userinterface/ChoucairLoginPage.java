package co.com.choucair.certification.ProyectoBase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the login form").
            located(By.xpath("/html[@class='yui3-js-enabled']/body[@id='page-login-index']/div[@id='page-wrapper']/div[@id='page']/div[@id='page-content']/section[@id='region-main']/div[2]/header[@id='head-menu']/div[@class='d-none d-lg-block']/nav[@id='nav-menu']/ul[@class='navbar-nav nav-flex-icons']/li[@class='nav-item']/a[@class='btn btn-info btn-sm text-white']"));
    public static final Target INPUT_USER = Target.the("Where the user write the username").
            located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("Where the user write the password").
            located(By.id("password"));
    public static final Target ACCESS_BUTTON = Target.the("Press me to login").
            located(By.xpath("//button[contains(@class,'btn btn-primary')]"));
}
