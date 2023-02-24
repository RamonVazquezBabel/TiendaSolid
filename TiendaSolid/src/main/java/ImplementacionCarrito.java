package src.main.java;

import java.util.ArrayList;
import java.util.List;

public class ImplementacionCarrito implements Carrito {
    private List<Producto> productos;

    public ImplementacionCarrito() {
        productos = new ArrayList<>();
    }

    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public void quitarProducto(Producto producto) {
        productos.remove(producto);
    }

    @Override
    public double calcularPrecioTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    @Override
    public List<Producto> getProductos() {
        return null;
    }
}
