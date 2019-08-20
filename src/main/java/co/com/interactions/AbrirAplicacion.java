package co.com.interactions;

import co.com.userinterface.YouTubePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.fluentlenium.core.annotation.Page;

public class AbrirAplicacion implements Interaction {

  @Page
  YouTubePage youTubePage;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Open.browserOn(youTubePage)
    );
  }
  public static Performable paginaYouTube() {
    return Tasks.instrumented(AbrirAplicacion.class);
  }
}
