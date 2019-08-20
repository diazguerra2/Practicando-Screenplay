package co.com.tasks;

import static co.com.userinterface.YouTubePage.BOTON_TENDENCIAS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class IngresarSeccion implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    BOTON_TENDENCIAS.resolveFor(actor).waitUntilVisible().click();
  }

  public static Performable Tendencias() {
    return Tasks.instrumented(IngresarSeccion.class);
  }

}
