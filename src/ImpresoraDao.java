
/*
 * @Author: yeraldin
 * @Date: 2021-07-23 20:49:22
 * @Last Modified by: Juan José González Giraldo
 * @Last Modified time: 2021-07-23 20:53:02
 */
import java.util.ArrayList;
import java.util.List;

public class ImpresoraDao implements Dao<Impresora> {
    private List<Impresora> impresoras = new ArrayList<>();
 // metodo que busca una impreso por su id
    @Override
    public Impresora consultar(int id) {
        return impresoras.get(id);
    }
// metodo que guarda una impresora
    @Override
    public void guardar(Impresora impresora) {
        impresora.setId(impresoras.size());
        impresoras.add(impresora);
    }
//metodo que busca todas las impresoras
    @Override
    public List<Impresora> consultarTodos() {
        return impresoras;

    }
//metodo que actualiza una impresora
    @Override
    public void actualizar(Impresora impresora, String[] params) {
        impresora.setSerial(params[0]);
        impresora.setMarca(params[1]);
        impresora.setEscaner(Boolean.parseBoolean(params[2]));

        impresoras.add(impresora);
    }
// metodo que borra una impresora
    @Override
    public void borrar(Impresora impresora) {
        impresoras.remove(impresora);
    }
}