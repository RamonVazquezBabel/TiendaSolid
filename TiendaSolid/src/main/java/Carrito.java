package src.main.java;

import java.util.List;

public interface Carrito {
    void agregarProducto(Producto producto);
    void quitarProducto(Producto producto);
    double calcularPrecioTotal();

    List<Producto> getProductos();
}
