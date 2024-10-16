import java.util.HashMap;

public class Tienda {

    HashMap<Integer, String> productos = new HashMap<>();


    public void registroNuevo(int codigo, String nombre) {
        productos.put(codigo, nombre);
    }

    public void busquedaCodigo(int buscarcodigo) {
        if (productos.containsKey(buscarcodigo)) {
            System.out.println("El producto con codigo " + buscarcodigo + " se encuentra registrado");
        } else {
            System.out.println("El producto con codigo " + buscarcodigo + " no se encuentra registrado");
        }
    }

    public void busquedaNombre(String buscarNombre) {
        if (productos.containsValue(buscarNombre)) {
            System.out.println("El Nommbre del producto " + buscarNombre + " se encuentra registrado");
        } else {
            System.out.println("El Nommbre del producto " + buscarNombre + " no se encuentra registrado");
        }
    }

    public void codigosRegistrados() {
        System.out.println("\nCodigo de productos registrados\n");
        System.out.println(productos.keySet());
    }

    public void nombresRegistrados() {
        System.out.println("\nNombre de productos registrados\n");
        System.out.println(productos.values());
    }

    public void eliminarProducto(int elmrpdto) {
        productos.remove(elmrpdto);
    }

}