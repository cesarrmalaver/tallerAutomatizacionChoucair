package co.com.choucair.certification.ProyectoBase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage {
    public static final Target SELECT_CAT = Target.the("Choose what kind of course").
            located(By.xpath("/html[@class='yui3-js-enabled']/body[@id='page-my-index']/div[@id='page-wrapper']/div[@id='page']/div[@id='learningcontent']/div[@id='page-content']/div[@id='region-main-box']/section[@id='region-main']/div[2]/aside[@id='block-region-content']/section[@id='inst3034']/div[@class='card-body p-3']/div[@class='card-text content mt-3']/div[@class='no-overflow']/center/div[@class='container']/div[@class='row']/div[@class='card-group col-md-6 col-lg-12']/div[@id='certificaciones']/div[@class='card-header']/a/h4/strong"));
    public static final Target SEARCH_BOX = Target.the("Where the user write the course").
            located(By.id("coursesearchbox"));
    public static final Target SEARCH_BUTTON = Target.the("Click me to search the course").
            located(By.xpath("/html[@class='yui3-js-enabled']/body[@id='page-course-index-category']/div[@id='page-wrapper']/div[@id='page']/div[@id='learningcontent']/div[@id='page-content']/div[@id='region-main-box']/section[@id='region-main']/div[2]/form[@id='coursesearch']/fieldset[@class='coursesearchbox invisiblefieldset']/button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Open the course").
            located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));
    public static final Target COURSE_TITLE = Target.the("Check the title").
            located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/section/div/div[1]/div/div[1]/h3/a"));

}
