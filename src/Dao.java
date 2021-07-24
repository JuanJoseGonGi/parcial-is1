import java.util.List;
import java.util.Optional;

public interface Dao<T> {
  Optional<T> consultar(String serial);

  List<T> consultarTodos();

  void guardar(T t);

  void actualizar(T t, String[] params);

  void borrar(T t);
}
