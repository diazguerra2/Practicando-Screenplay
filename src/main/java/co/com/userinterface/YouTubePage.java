package co.com.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.youtube.com/")

public class YouTubePage extends PageObject {

  public static final Target CAMPO_BUSQUEDA_YOUTUBE = Target
      .the("Campo para búsqueda de Video de Youtube").located(By.xpath("//input[@id='search']"));
  public static final Target BOTON_BUSQUEDA_YOUTUBE = Target
      .the("Botón para búsqueda de Video de Youtube").located(By.id("search-icon-legacy"));
  public static final Target PRIMER_VIDEO_LISTADO= Target.the("Primer Video Listado").located(By.xpath("//ytd-video-renderer[@class='style-scope ytd-item-section-renderer'][1]"));
  public static final Target VIDEO_LISTADO_TENDENCIAS= Target.the("Primer Video Listado en la sección de tendencias").located(By.xpath("//ytd-item-section-renderer[@class='style-scope ytd-section-list-renderer'][1]"));
  public static final Target BOTON_TENDENCIAS= Target.the("Botón para ingresar a la sección de tendencias").located(By.xpath(" //span[@class='title style-scope ytd-guide-entry-renderer'][contains(text(),'Tendencias')]"));
  public static final Target VIDEO_YOUTUBE_SELECCIONADO = Target.the("Video de YouTube seleccionado").located(By.xpath("//video[@class='video-stream html5-main-video']"));
}
