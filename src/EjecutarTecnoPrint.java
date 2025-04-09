import java.util.Date;

public class EjecutarTecnoPrint {
    public static void main (String [] args){

        // creacion de clientes

        Cliente [] baseDeDatos1 = new Cliente[2];
        baseDeDatos1 [0] = new Cliente("Jhon","300 841 54 54","Calle 11 # 35 20","jhoncano@campusucc.edu.co","45955875");
        baseDeDatos1 [1] = new Cliente("Javier","305 295 60 65","cra 22A # 65 69","javier.rosero@campusucc.edu.co","6592865");

        // imprimo la informacion
        System.out.println(baseDeDatos1[0]);
        System.out.println(baseDeDatos1[1]);

        //actualizar cliente
        baseDeDatos1[0].actualizarCliente("Jhon Canon","300 841 54 54","Cra 35 # 35 20","jhoncano@campusucc.edu.co","45955875");
        System.out.println(baseDeDatos1[0]);

        // alimentamos el inventario de camaras
        Camara [] camarasProducto = new Camara[2];
        camarasProducto [0]= new Camara("Eos Rebel","Cámara SLR ideal para principiantes, \ncon sensor CMOS, procesador DIGIC 4, pantalla LCD, \nISO ampliado y funciones creativas","Digital","001",5,1900000.36,"Canon","EOS Rebel T5");
        camarasProducto [1] = new Camara("Sony Alpha","La Cámara 4K HDR Sony Vlog de Lentes Intercambiables - ZV-E10L \nestá diseñada para vlogueros creativos que buscan lograr una apariencia artística. \nLa ZV-E10 se encarga de los aspectos técnicos de la producción de video.","Digital","002",5,3397123.35,"Sony","Kit ZV-E10 f/3.5-5.6 OSS ILCZVE10L");

        // arreglo de producto

        Producto [] pedido1 = new Producto[1];
        pedido1[0] = camarasProducto [0];
        Date fechaActual = new Date();
        //uso metodo para dar descuento
        pedido1[0].aplicarDescuento();


        // se genera el primer pedido

        Pedido ordenVenta = new Pedido(baseDeDatos1[0],pedido1,fechaActual,5251545);
        System.out.println(ordenVenta);








    }
}
