import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void testCrearPedido() {
        Pedido p = new Pedido(1, "Tacos de bistec", 60.0);
        assertEquals(1, p.getNumero());
        assertEquals("Tacos de bistec", p.getDescripcion());
        assertEquals(60.0, p.getPrecio());
        assertEquals("Activo", p.getEstado());
    }

    @Test
    public void testMarcarPedidoComoCompletado() {
        Pedido p = new Pedido(2, "Hamburguesa con papas", 85.0);
        p.marcarComoCompletado();
        assertEquals("Completado", p.getEstado());
    }
}
