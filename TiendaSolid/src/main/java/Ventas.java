
import java.util.List;

public class Ventas{
    private List<Producto> productos;

    public Ventas(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void compra(Producto producto, int cantidadSolicitada) {
        producto.hayStock(producto,cantidadSolicitada);
    }

    public void reporteVenta(List<Producto> ventas){

    }
}
