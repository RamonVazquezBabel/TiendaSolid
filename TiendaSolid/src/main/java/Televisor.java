public class Televisor extends Producto{
    private int idTelevisor;
    private string marca;

    public Televisor(){

    }

    public Televisor(int idTelevisor, string marca) {
        this.idTelevisor = idTelevisor;
        this.marca = marca;
    }

    public int getIdTelevisor() {
        return idTelevisor;
    }

    public void setIdTelevisor(int idTelevisor) {
        this.idTelevisor = idTelevisor;
    }

    public string getMarca() {
        return marca;
    }

    public void setMarca(string marca) {
        this.marca = marca;
    }
}