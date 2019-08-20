package co.com.interactions;

import static co.com.userinterface.YouTubePage.PRIMER_VIDEO_LISTADO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SeleccionaVideo implements Task {


  @Override
  public <T extends Actor> void performAs(T actor) {
    PRIMER_VIDEO_LISTADO.resolveFor(actor).waitUntilVisible().click();
  }

  public static Performable encontrado() {
    return Tasks.instrumented(SeleccionaVideo.class);
  }

}
