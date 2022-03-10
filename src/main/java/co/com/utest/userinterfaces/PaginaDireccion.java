package co.com.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDireccion {

    public static  final Target CIUDAD = Target.the("ciudad")
            .located(By.id("city"));

    public static  final Target ZIP = Target.the("zip")
            .located(By.id("zip"));

    public static final Target CONTENEDOR_PAIS = Target.the("contenedor para pais")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));


    public static  final  Target PAIS = Target.the("pais")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target BOTON_DISPOSITIVOS = Target.the("boton dispositivos")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));


}
