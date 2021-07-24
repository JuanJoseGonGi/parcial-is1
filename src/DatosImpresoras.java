
/*
 * @Author: Juan José González Giraldo
 * @Date: 2021-07-23 20:17:42
 * @Last Modified by: Juan José González Giraldo
 * @Last Modified time: 2021-07-23 20:42:18
 */
import java.util.List;

/**
 * {@link DatosImpresoras} is an abstraction of a printer info management system
 */
public class DatosImpresoras {
  /** The data access object for {@link Impresora} */
  private Dao<Impresora> impresoraDao;

  /** Constructor without parameters */
  public DatosImpresoras() {
    impresoraDao = new ImpresoraDao();
  }

  /**
   * Returns a {@link List} of the stored {@link Impresora} objects
   *
   * @return
   */
  public List<Impresora> consultarImpresoras() {
    return impresoraDao.consultarTodos();
  }

  /**
   * Returns the {@link Impresora} associated with the id
   *
   * @param id unique identifier of the {@link Impresora}
   * @return
   */
  public Impresora buscarImpresora(int id) {
    return impresoraDao.consultar(id);
  }

  public void añadirImpresora(String serial, String marca, Boolean escaner) {
    impresoraDao.guardar(new Impresora(serial, marca, escaner));
  }
}
