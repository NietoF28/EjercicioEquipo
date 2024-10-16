import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Tienda tienda = new Tienda();

        int opc, codigo, buscarCodigo, elmrpdto;
        String nombre, buscarNombre;

        do {

            System.out.println("\nRegistro de Productos\n");
            System.out.println("Escoja una opcion");
            System.out.println("1. Nuevo Registro");
            System.out.println("2. Busqueda por Codigo");
            System.out.println("3. Busqueda por Nombre");
            System.out.println("4. Mostrar Codigo de los productos registrados");
            System.out.println("5. Mostrar Nombre de los productos registrados");
            System.out.println("6. Eliminar producto");
            System.out.println("7. Salir");
            opc = teclado.nextInt();

            switch (opc) {

                case 1:
                    System.out.println("\nNuevo Registro\n");
                    System.out.println("Ingrese el codigo del producto");
                    codigo = teclado.nextInt();
                    System.out.println("Ingrese el nombre del producto");
                    nombre = teclado.next();
                    tienda.registroNuevo(codigo, nombre);
                    break;


                case 2:
                    System.out.println("\nBusqueda por Codigo\n");
                    System.out.println("Ingrese Codigo");
                    buscarCodigo = teclado.nextInt();
                    tienda.busquedaCodigo(buscarCodigo);
                    break;


                case 3:
                    System.out.println("\nBusqueda por Nombre\n");
                    System.out.println("Ingreses el nombre del producto");
                    buscarNombre = teclado.next();
                    tienda.busquedaNombre(buscarNombre);
                    break;

                case 4:
                    tienda.codigosRegistrados();
                    break;

                case 5:
                    tienda.nombresRegistrados();
                    break;

                case 6:

                    System.out.println("\nEliminacion de producto\n");
                    System.out.println("Ingrese el codigo del producto a borrar");
                    elmrpdto = teclado.nextInt();
                    tienda.eliminarProducto(elmrpdto);
                    break;

                case 7:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }
        while (opc != 7);
    }
    }
