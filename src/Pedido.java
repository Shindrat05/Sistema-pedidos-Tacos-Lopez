public class Pedido {
    private int numero;
    private String descripcion;
    private double precio;
    private String estado;

    public Pedido(int numero, String descripcion, double precio) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = "Activo";
    }

    public int getNumero() {
        return numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getEstado() {
        return estado;
    }

    public void marcarComoCompletado() {
        this.estado = "Completado";
    }

    public void cancelar() {
        this.estado = "Cancelado";
    }

    public void editar(String nuevaDescripcion, double nuevoPrecio) {
        this.descripcion = nuevaDescripcion;
        this.precio = nuevoPrecio;
    }

    @Override
    public String toString() {
        return "Pedido #" + numero + " - " + descripcion + " - $" + precio + " - Estado: " + estado;
    }
}
