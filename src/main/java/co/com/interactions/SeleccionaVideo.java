package co.com.interactions;

import static co.com.userinterface.YouTubePage.PRIMER_VIDEO_LISTADO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionaVideo implements Interaction {


  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(PRIMER_VIDEO_LISTADO));
  }

  public static Performable encontrado() {
    return Tasks.instrumented(SeleccionaVideo.class);
  }

}
