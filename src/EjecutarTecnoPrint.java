import java.util.Date;

public class EjecutarTecnoPrint {
    public static void main (String [] args){

        // creacion de clientes
        Cliente cliente[] = new Cliente[2];
        cliente[0] = new Cliente("Daniel", "3024558789 ", "CRA 35B # 125 48", "daniel@gmail.com", "548557898");
        cliente[1] = new Cliente("Sebastian", "3054448789 ", "CRA 65 # 44 02", "sebastian@gmail.com", "66925465");

        // creacion de productos 

        Producto producto[] = new Producto[4];
        producto[0] = new Camara("Sony", "La Cámara 4K HDR Sony Vlog de Lentes Intercambiables\n - ZV-E10L está diseñada para vlogueros creativos que buscan lograr una apariencia artística.\n La ZV-E10 se encarga de los aspectos técnicos de la producción de video.", "Digital", "0001", 2, 2620400, "Sony", "Alpha Kit ZV-E10");
        



    }
}
