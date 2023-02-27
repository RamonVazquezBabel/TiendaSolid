

import java.util.List;

public class ReporteVentas {
    private List<Ventas> ventas;

    public ReporteVentas(List<Ventas> ventas) {
        this.ventas = ventas;
    }

    public int getCantidadVentas() {
        return ventas.size();
    }

    public double getMontoTotalVentas() {
        return ventas.stream().mapToDouble(this::calcularMontoVenta).sum();
    }

    private double calcularMontoVenta(Ventas venta) {
        return venta.getProductos().stream().mapToDouble(Producto::getPrecio).sum();
    }
}
