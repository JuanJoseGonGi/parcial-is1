import java.util.List;

public interface Dao<T> {
  T consultar(String serial);

  List<T> consultarTodos();

  void guardar(T t);

  void actualizar(T t, String[] params);

  void borrar(T t);
}
