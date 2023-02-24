package src.main.java;

public interface Inventario {
    int getCantidadEnStock(Producto producto);
    void actualizarInventario(Venta venta);

    abstract void agregarAlInventario(Producto producto, int cantidad);
}
