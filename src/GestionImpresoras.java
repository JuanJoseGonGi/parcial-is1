
/*
 * @Author: Juan José González Giraldo
 * @Date: 2021-07-23 20:37:23
 * @Last Modified by: Juan José González Giraldo
 * @Last Modified time: 2021-07-23 20:53:28
 */
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * {@link GestionImpresoras} is an abstraction of a printer management system
 */
public class GestionImpresoras {
  /** Object used to log messages */
  private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  /**
   * Initialization method of the program
   *
   * @param args
   */
  public static void main(String[] args) {
    var datosImpresoras = new DatosImpresoras();

    datosImpresoras.añadirImpresora("001", "HP", false);
    datosImpresoras.añadirImpresora("002", "HP", false);
    datosImpresoras.añadirImpresora("003", "Panasonic", true);

    var impresoras = datosImpresoras.consultarImpresoras();
    var impresorasString = "\n";

    for (Impresora impresora : impresoras) {
      impresorasString += impresora;
      impresorasString += "\n";
    }

    LOGGER.log(Level.INFO, impresorasString);

    var impr2 = datosImpresoras.buscarImpresora(1);
    var impr2String = impr2.toString();

    LOGGER.log(Level.INFO, impr2String);
  }
}
