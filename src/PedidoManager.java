import java.util.HashMap;
import java.util.Map;

public class PedidoManager {
    private Map<Integer, Pedido> pedidos = new HashMap<>();
    private int contador = 1;

    public int agregarPedido(String descripcion, double precio) {
        Pedido nuevo = new Pedido(contador, descripcion, precio);
        pedidos.put(contador, nuevo);
        return contador++;
    }

    public Pedido consultarPedido(int numero) {
        return pedidos.get(numero);
    }

    public boolean editarPedido(int numero, String nuevaDescripcion, double nuevoPrecio) {
        Pedido p = pedidos.get(numero);
        if (p != null && p.getEstado().equals("Activo")) {
            p.editar(nuevaDescripcion, nuevoPrecio);
            return true;
        }
        return false;
    }

    public boolean cancelarPedido(int numero) {
        Pedido p = pedidos.get(numero);
        if (p != null && p.getEstado().equals("Activo")) {
            p.cancelar();
            return true;
        }
        return false;
    }

    public boolean completarPedido(int numero) {
        Pedido p = pedidos.get(numero);
        if (p != null && p.getEstado().equals("Activo")) {
            p.marcarComoCompletado();
            return true;
        }
        return false;
    }
}
