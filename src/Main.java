import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PedidoManager manager = new PedidoManager();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Sistema de Pedidos ---");
            System.out.println("1. Crear nuevo pedido");
            System.out.println("2. Consultar pedido");
            System.out.println("3. Editar pedido");
            System.out.println("4. Cancelar pedido");
            System.out.println("5. Completar pedido");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Descripción: ");
                    String desc = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    int numPedido = manager.agregarPedido(desc, precio);
                    System.out.println("Pedido #" + numPedido + " creado.");
                    break;

                case 2:
                    System.out.print("Número de pedido: ");
                    int numConsulta = sc.nextInt();
                    Pedido p = manager.consultarPedido(numConsulta);
                    System.out.println(p != null ? p : "Pedido no encontrado.");
                    break;

                case 3:
                    System.out.print("Número de pedido a editar: ");
                    int numEditar = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nueva descripción: ");
                    String nuevaDesc = sc.nextLine();
                    System.out.print("Nuevo precio: ");
                    double nuevoPrecio = sc.nextDouble();
                    if (manager.editarPedido(numEditar, nuevaDesc, nuevoPrecio)) {
                        System.out.println("Pedido editado.");
                    } else {
                        System.out.println("No se pudo editar (¿pedido no existe o no está activo?).");
                    }
                    break;

                case 4:
                    System.out.print("Número de pedido a cancelar: ");
                    int numCancelar = sc.nextInt();
                    if (manager.cancelarPedido(numCancelar)) {
                        System.out.println("Pedido cancelado.");
                    } else {
                        System.out.println("No se pudo cancelar.");
                    }
                    break;

                case 5:
                    System.out.print("Número de pedido a completar: ");
                    int numCompletar = sc.nextInt();
                    if (manager.completarPedido(numCompletar)) {
                        System.out.println("Pedido completado.");
                    } else {
                        System.out.println("No se pudo completar.");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}
