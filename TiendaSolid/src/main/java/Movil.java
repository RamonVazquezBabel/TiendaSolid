

public class Movil extends Producto{
    private int idMovil;

    public Movil(int idMovil) {
        this.idMovil = idMovil;
    }


    public int getIdMovil() {
        return idMovil;
    }

    public void setIdMovil(int idMovil) {
        this.idMovil = idMovil;
    }

    public Movil(String nombreProducto, int stock, String descripcion, double precio) {
        super(nombreProducto, stock, descripcion, precio);
    }


}
