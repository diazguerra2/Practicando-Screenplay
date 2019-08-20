package co.com.interactions;

import static co.com.userinterface.YouTubePage.VIDEO_LISTADO_TENDENCIAS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;

public class SeleccionaVideoTendencia implements Task {

  private String tendenciaListado;

  public SeleccionaVideoTendencia(String tendenciaListado) {
    this.tendenciaListado = tendenciaListado;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String videoDeseado = tendenciaListado.substring(9, 10);
    VIDEO_LISTADO_TENDENCIAS.resolveFor(actor).findElement(By.xpath(
        "//ytd-video-renderer[@class='style-scope ytd-expanded-shelf-contents-renderer']["
            + videoDeseado + "]")).click();
  }

  public static Performable listado(String tendenciaListado) {
    return Tasks.instrumented(SeleccionaVideoTendencia.class, tendenciaListado);
  }

}
