# language: es
Característica: visualizar vídeos de YouYube
  Como usuario de youtube
  quiero buscar videos a mi gusto
  para poder visualizar uno de ellos

  Esquema del escenario: visualizar video de YouYube
    Dado que <Usuario> está interesado en ver un video de YouTube
    Cuando busca el video <video>
    Entonces puede visualizar exitosamente uno de los videos encontrados

    Ejemplos:
      | Usuario     | video             |
      | Juan Felipe | bohemian rhapsody |
      | Angie Arias | Clint Eastwood    |

  Esquema del escenario: visualizar videos de Youtube que son Tendencia
    Dado que <Usuario> está interesado en ver un video de YouTube
    Cuando ingresa a las tendencias
    Y selecciona <Video en tendencia> un video en la lista de tendencias
    Entonces puede visualizar exitosamente uno de los videos encontrados

    Ejemplos:
      | Usuario     | Video en tendencia |
      | Juan Felipe | Tendencia1         |
      | Angie Arias | Tendencia2         |
      | Mario Bross | Tendencia3         |


