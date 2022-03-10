package co.com.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDispositivos {

    public static final Target CONTENEDOR_DISPOSITIVO_movil = Target.the("contenedor dispositivo")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div"));

    public  static  final  Target DISPOSITIVO_MOVIL = Target.the("dispositivo movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));



    public static final Target CONTENEDOR_MODELO_MOVIL = Target.the("contenedor modelo")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div"));

    public  static  final  Target MODELO_MOVIL = Target.the("dispositivo movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));




    public static final Target CONTENEDOR_SISTEMA_OPERATIVO = Target.the("contenedor modelo")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div"));

    public  static  final  Target SISTEMA_OPERATIVO = Target.the("dispositivo movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));


    public static final Target BOTON_SECCION_FINA = Target.the("boton lleva a pagina final")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
