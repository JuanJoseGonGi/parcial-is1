import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ImpresoraDao implements Dao<Impresora> {
    
    private List<Impresora> impresoras = new ArrayList<>();
    
    public ImpresoraDao() {
        impresoras.add(new Impresora());
        impresoras.add(new Impresora());
    }
    
    @Override
    public Optional<Impresora> consultar(String serial) {
        return Optional.ofNullable(impresoras.consultar((String) serial));
    }
    
    
    @Override
    public void guardar(Impresora impresora) {
        ((List<Impresora>) impresora).add(impresora);
    }
    }
    @Override
    public List<Impresora> consultarTodos() {
        return impresoras;
        
    }

    @Override
    public void actualizar(Impresora impresora, String[] params) {
        impresora.setSerial(Objects.requireNonNull(
          params[0], "el serial no puede ser  null"));
        impresora.setMarca(Objects.requireNonNull(
          params[1], "la marca no puede ser null"));
        
          impresoras.add(impresora);
    }

    @Override
    public void borrar(Impresora impresora) {
        impresoras.remove(impresora);
        
    }

}