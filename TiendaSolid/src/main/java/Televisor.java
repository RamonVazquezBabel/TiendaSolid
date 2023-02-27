public class Televisor extends Producto{
    private int idTelevisor;
    private String marca;

    public Televisor(){

    }

    public Televisor(int idTelevisor, String marca) {

        this.idTelevisor = idTelevisor;
    }

    public Televisor(String nombreProducto, int stock, String descripcion, double precio) {
        super(nombreProducto, stock, descripcion, precio);
    }

    public int getIdTelevisor() {
        return idTelevisor;
    }

    public void setIdTelevisor(int idTelevisor) {
        this.idTelevisor = idTelevisor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}