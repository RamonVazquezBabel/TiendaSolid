public class Ordenador extends Catalogo{
    private String marca;
    public Ordenador(String nombreProducto, int stock, String descripcion, double precio, String marca) {
        super(nombreProducto, stock, descripcion, precio);
        this.marca = marca;
    }


}
