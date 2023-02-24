package src.main.java;

import java.util.List;

public class ReporteVentas {
    private List<Venta> ventas;

    public ReporteVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public int getCantidadVentas() {
        return ventas.size();
    }

    public double getMontoTotalVentas() {
        return ventas.stream().mapToDouble(this::calcularMontoVenta).sum();
    }

    private double calcularMontoVenta(Venta venta) {
        return venta.getProductos().stream().mapToDouble(Producto::getPrecio).sum();
    }
}

