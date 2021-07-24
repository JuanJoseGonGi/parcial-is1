import java.util.List;

public class DatosImpresoras {
  private Dao<Impresora> impresoraDao;

  public List<Impresora> consultarImpresoras() {
    return impresoraDao.consultarTodos();
  }

  public Impresora buscarImpresora(String serial) {
    return impresoraDao.consultar(serial);
  }

  public void añadirImpresora(String serial, String marca, Boolean escaner) {
    impresoraDao.guardar(new Impresora(serial, marca, escaner));
  }
}
