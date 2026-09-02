import java.util.*;

public class Inventario {

    private int id;

    // Producto -> Variante -> Cantidad
    private Map<Producto, Map<Map<String, Object>, Integer>> productos;


    public Inventario() {
        productos = new HashMap<>();
    }


    public static Inventario crear_inventario() {
        return new Inventario();
    }


    // GETTERS

    public int get_id() {
        return id;
    }


    public Map<Producto, Map<Map<String, Object>, Integer>> get_productos() {
        return productos;
    }


    // PRODUCTOS

    // public Map<String, Object> agregar_producto(Producto producto) {}


    // public Map<String, Object> buscar_producto(Producto producto) {}


    // EXISTENCIAS

    // public Map<String, Object> agregar_existencias(
    //         Producto producto,
    //         Map<String, Object> variante,
    //         int cantidad) {}


    // public Map<String, Object> retirar_existencias(
    //         Producto producto,
    //         Map<String, Object> variante,
    //         int cantidad) {}


    // public int obtener_existencias(
    //         Producto producto,
    //         Map<String, Object> variante) {}
}