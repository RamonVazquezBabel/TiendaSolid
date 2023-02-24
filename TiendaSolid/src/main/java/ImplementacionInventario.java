package src.main.java;
import java.util.HashMap;
import java.util.Map;

public class ImplementacionInventario implements Inventario {
    private Map<Producto, Integer> inventario;

    public ImplementacionInventario() {
        inventario = new HashMap<>();
    }

    @Override
    public int getCantidadEnStock(Producto producto) {
        return inventario.getOrDefault(producto, 0);
    }

    @Override
    public void actualizarInventario(Venta venta) {
        for (Producto producto : venta.getProductos()) {
            int cantidadActual = inventario.getOrDefault(producto, 0);
            int cantidadVendida = venta.getProductos().stream().filter(p -> p.equals(producto)).mapToInt(p -> 1).sum();
            int cantidadNueva = cantidadActual - cantidadVendida;
            inventario.put(producto, cantidadNueva);
        }
    }

    @Override
    public void agregarAlInventario(Producto producto, int cantidad) {
        int cantidadActual = inventario.getOrDefault(producto, 0);
        inventario.put(producto, cantidadActual + cantidad);
    }
}

