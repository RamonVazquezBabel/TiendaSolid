public interface Carrito {
    void agregarProducto(Producto producto);
    void quitarProducto(Producto producto);
    double calcularPrecioTotal();
}