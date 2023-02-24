public abstract class Catalogo {
    protected String nombreProducto;
    protected int stock;
    protected String descripcion;
    protected double precio;

    public Catalogo(String nombreProducto, int stock, String descripcion, double precio) {
        this.nombreProducto = nombreProducto;
        this.stock = stock;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
