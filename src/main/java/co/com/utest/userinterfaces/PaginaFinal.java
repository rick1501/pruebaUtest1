package co.com.utest.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFinal {

    public static final Target CLAVE = Target.the("clave")
            .located(By.id("password"));

    public static final Target CLAVECONFIRMADA = Target.the("clave confirmada")
            .located(By.id("confirmPassword"));

    public static final Target CHECKBOX_01 =  Target.the("chech 01")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));


    public static final Target CHECKBOX_02 =  Target.the("chech 02")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECKBOX_03 =  Target.the("chech 03")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));


    public static final Target BOTON_TERMINAR = Target.the("boton finalizar")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));

}
