package co.com.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/visualizar_video.feature",
    glue = "co.com.stepdefinitions",
    snippets = SnippetType.CAMELCASE
)

public class BusquedaVideoYouTubeRunner {

}
