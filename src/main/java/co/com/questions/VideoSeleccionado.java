package co.com.questions;

import static co.com.userinterface.YouTubePage.VIDEO_YOUTUBE_SELECCIONADO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.awaitility.Awaitility;
import org.awaitility.Duration;

public class VideoSeleccionado implements Question {

  @Override
  public Object answeredBy(Actor actor) {
    Awaitility.await().between(Duration.ONE_SECOND,Duration.FIVE_SECONDS);
    if (VIDEO_YOUTUBE_SELECCIONADO.resolveFor(actor).isPresent()){
      return true;
    }
     return false;
  }

    public static VideoSeleccionado esVistoExitosamente () {
      return new VideoSeleccionado();
    }
  }
