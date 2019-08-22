package co.com.tasks;

import static co.com.userinterface.YouTubePage.BOTON_BUSQUEDA_YOUTUBE;
import static co.com.userinterface.YouTubePage.CAMPO_BUSQUEDA_YOUTUBE;

import co.com.model.Video;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class BuscarVideo implements Task {

  private static Video videoBuscado = new Video();

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(SendKeys.of(videoBuscado.getNombreVideo()).into(CAMPO_BUSQUEDA_YOUTUBE));
    actor.attemptsTo(Click.on(BOTON_BUSQUEDA_YOUTUBE));
  }

  public static Performable enYouTube(String video) {
    videoBuscado.setNombreVideo(video);
    return Tasks.instrumented(BuscarVideo.class,video);
}

}
