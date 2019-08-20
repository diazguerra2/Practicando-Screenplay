package co.com.model;

public class Video {

  private String nombreVideo;

  public static Video video(){
    return new Video();
  }

  public String getNombreVideo() {
    return nombreVideo;
  }
  public void setNombreVideo(String nombreVideo){
    this.nombreVideo=nombreVideo;
  }

}
