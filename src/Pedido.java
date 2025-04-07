import java.util.Date;
import java.util.Random;

public class Pedido {
    //Atributos
    private Cliente cliente;
    private Producto [] producto;
    private Date fecha;
    private int numeroTargeta;
    private int numeroPedido; // va dar un numero para  simular el pedido

    //Constructor
    public Pedido (Cliente cliente, Producto[] producto, Date fecha, int numeroTargeta){
    this.cliente = cliente;
    this.producto = producto;
    this.fecha = fecha;
    this.numeroTargeta = numeroTargeta;

    // uso Random para generar un numero de pedido entre 1 al 5000
    Random random = new Random();
    this.numeroPedido = 1 + random.nextInt(5000);
    }

}
