package src.main.java;

import java.util.List;

public class ReporteEntradas {
    private List<Venta> ventas;

    public ReporteEntradas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public int getCantidadProductosVendidos() {
        return ventas.stream().mapToInt(v -> v.getProductos().size()).sum();
    }

    public double getMontoTotalEntradas() {
        return ventas.stream().mapToDouble(this::calcularMontoDeEntrada).sum();
    }

    private double calcularMontoDeEntrada(Venta venta) {
        return venta.getProductos().stream().mapToDouble(Producto::getPrecio).sum();
    }
}

