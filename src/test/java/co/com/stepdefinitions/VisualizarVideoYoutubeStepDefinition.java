package co.com.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.interactions.AbrirAplicacion;
import co.com.interactions.SeleccionaVideo;
import co.com.interactions.SeleccionaVideoTendencia;
import co.com.questions.VideoSeleccionado;
import co.com.tasks.BuscarVideo;
import co.com.tasks.IngresarSeccion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class VisualizarVideoYoutubeStepDefinition {

  @Before
  public void prepararEscenario() {
    OnStage.setTheStage(new OnlineCast());
  }

  @Dado("^que (.*) está interesado en ver un video de YouTube$")
  public void ingresarYouTube(String usuario) {
    theActorCalled(usuario).attemptsTo(AbrirAplicacion.paginaYouTube());
  }

  @Cuando("^busca el video (.*)$")
  public void buscarVideoYouTube(String video) {
    theActorInTheSpotlight().attemptsTo(BuscarVideo.enYouTube(video),SeleccionaVideo.encontrado());
  }

  @Entonces("^puede visualizar exitosamente uno de los videos encontrados$")
  public void visualizarVideoYouTube() {
theActorInTheSpotlight().should(GivenWhenThen.seeThat(VideoSeleccionado.esVistoExitosamente()));
  }

  @Cuando("^ingresa a las tendencias$")
  public void ingresarSeccionTendencias() {
    theActorInTheSpotlight().attemptsTo(IngresarSeccion.Tendencias());
  }

  @Y("^selecciona (.*) un video en la lista de tendencias$")
  public void seleccionarVideoListadoTendencias(String videoTendencia) {
    theActorInTheSpotlight().attemptsTo(SeleccionaVideoTendencia.listado(videoTendencia));
  }
}
