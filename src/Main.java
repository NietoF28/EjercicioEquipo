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
            System.out.println("4. Salir");
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
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }
        while (opc != 4);
    }
    }
