import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void Main (String[]args){
        Producto ordenadores = new Ordenador("Asus",100,"portátil",1000);
        Producto consolas = new Consola("PlayStation",35,"PlayStation 5",600);
        Producto televisores = new Televisor("Televisión SAMSUNG",50,"Television 8K",2500);
        Producto telefonos = new Movil("Xiaomi Mi 13",120,"Xiaomi Mi 13 128GB",550);

        List<Producto> productos = new ArrayList<>();
        Ventas venta = new Ventas(productos);
        venta.compra(ordenadores,5);

    

    }
}
