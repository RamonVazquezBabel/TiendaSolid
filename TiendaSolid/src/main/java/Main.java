package src.main.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear algunos productos
        Producto movil = new Producto("Móvil", 1000.0);
        Producto portatil = new Producto("Portatil", 2000.0);
        Producto television = new Producto("Televisión", 500.0);

        // Crear un inventario y agregar algunos productos
        Inventario inventario = new ImplementacionInventario();
        inventario.actualizarInventario(new Venta(null, Arrays.asList(movil, television, portatil)));
        inventario.actualizarInventario(new Venta(null, Arrays.asList(movil, television, television, television)));
        inventario.agregarAlInventario(new Producto("Portatil", 2000.0), 10);
        inventario.agregarAlInventario(new Producto("Móvil", 800.0), 20);
        inventario.agregarAlInventario(new Producto("Televisión", 500.0), 20);

        // Crear un carrito y agregar algunos productos
        Carrito carrito = new ImplementacionCarrito();
        carrito.agregarProducto(movil);
        carrito.agregarProducto(portatil);
        carrito.agregarProducto(television);

        // Crear una venta a partir del carrito
       // Venta venta = new Venta(new Cliente("Juan", "Av. Siempreviva 742"), carrito.getProductos());


        // Crear cliente y venta
        Cliente cliente = new Cliente("Juan", "jperez@gmail.com");
        Producto producto = new Producto("Portatil", 500.0);
        Venta venta = new Venta(cliente, Arrays.asList(producto));

        // Actualizar el inventario con la venta
        inventario.actualizarInventario(venta);

        // Imprimir el reporte de ventas
        ReporteVentas reporteVentas = new ReporteVentas(Arrays.asList(venta));
        System.out.println("Cantidad de ventas: " + reporteVentas.getCantidadVentas());
        System.out.println("Monto total de ventas: €" + reporteVentas.getMontoTotalVentas());

        // Imprimir el reporte de entradas
        ReporteEntradas reporteEntradas = new ReporteEntradas(Arrays.asList(venta));
        System.out.println("Cantidad de productos vendidos: " + reporteEntradas.getCantidadProductosVendidos());
        System.out.println("Monto total de entradas: €" + reporteEntradas.getMontoTotalEntradas());

        // Imprimir mensaje de confirmación de compra
        System.out.println("Su compra se ha realizado correctamente: " + producto.getNombre() + " - Precio: €" + producto.getPrecio());
        System.out.println("En el stock hay: " + inventario);
    }
}

