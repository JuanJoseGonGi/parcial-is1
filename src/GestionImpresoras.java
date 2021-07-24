import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionImpresoras {
  private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  public static void main(String[] args) {
    var datosImpresoras = new DatosImpresoras();

    datosImpresoras.añadirImpresora("001", "HP", false);
    datosImpresoras.añadirImpresora("002", "HP", false);
    datosImpresoras.añadirImpresora("003", "Panasonic", true);

    var impresoras = datosImpresoras.consultarImpresoras();
    var impresorasString = "";

    for (Impresora impresora : impresoras) {
      impresorasString += impresora;
    }

    LOGGER.log(Level.INFO, impresorasString);

    var impr2 = datosImpresoras.buscarImpresora("002");
    var impr2String = impr2.toString();

    LOGGER.log(Level.INFO, impr2String);
  }
}
