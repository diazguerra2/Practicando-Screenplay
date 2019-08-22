package co.com.interactions;

import static co.com.userinterface.YouTubePage.VIDEO_LISTADO_TENDENCIAS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionaVideoTendencia implements Interaction {

  private String tendenciaListado;

  public SeleccionaVideoTendencia(String tendenciaListado) {
    this.tendenciaListado = tendenciaListado;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String videoDeseado = tendenciaListado.substring(9, 10);
    actor.attemptsTo(Click.on(VIDEO_LISTADO_TENDENCIAS.of(videoDeseado)));
  }

  public static Performable listado(String tendenciaListado) {
    return Tasks.instrumented(SeleccionaVideoTendencia.class, tendenciaListado);
  }

}
