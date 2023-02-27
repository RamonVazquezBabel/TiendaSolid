package src.main.java;

import java.util.List;

public class Venta {
    private Cliente cliente;
    private List<Producto> productos;

    public Venta(Cliente cliente, List<Producto> productos) {
        this.cliente = cliente;
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
