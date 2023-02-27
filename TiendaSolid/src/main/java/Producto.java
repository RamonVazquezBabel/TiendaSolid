public abstract class Producto {
    protected String nombreProducto;
    protected int stock;
    protected String descripcion;
    protected double precio;

    public Producto() {
    }

    public Producto(String nombreProducto, int stock, String descripcion, double precio) {
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

    public boolean hayStock(Producto p, int cantidadSolicitada){
        return p.getStock()>=cantidadSolicitada;
    }
    public void actualizaStockAlComprar(Producto p,int cantidadSolicitada){
        if (hayStock(p,cantidadSolicitada)){
            System.out.println("Se ha realizado la compra del producto "+p.getNombreProducto()+" correctamente");
            p.setStock(p.getStock() - cantidadSolicitada);
        }else{
            System.out.println("No hay stock suficiente para comprar "+cantidadSolicitada+ " unidadel de producto "+p.getNombreProducto());
        }

    }

    public void ventaProducto(Producto p, int cantidadSolicitada){
        if(hayStock(p,cantidadSolicitada)){
            p.actualizaStockAlComprar(p,cantidadSolicitada);
        }
    }


}
