
/*
 * @Author: Juan José González Giraldo
 * @Date: 2021-07-23 20:13:12
 * @Last Modified by: Juan José González Giraldo
 * @Last Modified time: 2021-07-23 20:15:33
 */
import java.util.List;

/** Data access pattern basic methods */
public interface Dao<T> {
  /**
   * Returns the item associated with the serial
   *
   * @param serial unique item identifier
   * @return
   */
  T consultar(String serial);

  /**
   * Returns all the items
   *
   * @return
   */
  List<T> consultarTodos();

  /**
   * Saves a new item
   *
   * @param t item to save
   */
  void guardar(T t);

  /**
   * Updates the item associated with the serial using the given parameters
   *
   * @param t      item to update
   * @param params parameters to update
   */
  void actualizar(T t, String[] params);

  /**
   * Removes the item associated with the serial
   *
   * @param t item to remove
   */
  void borrar(T t);
}
