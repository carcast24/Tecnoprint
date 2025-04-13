import java.util.Date;
import java.util.Scanner;

public class EjecutarTecnoPrint {
    Scanner Scaner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        // creacion de clientes
        Cliente cliente[] = new Cliente[2];
        cliente[0] = new Cliente("Daniel", "3024558789 ", "CRA 35B # 125 48", "daniel@gmail.com", "548557898");
        cliente[1] = new Cliente("Sebastian", "3054448789 ", "CRA 65 # 44 02", "sebastian@gmail.com", "66925465");
        // creacion de fotos
        Foto obj1[] = new Foto[2];
        obj1[0] = new Foto("200p", "JPG");
        obj1[1] = new Foto("300p", "ISO");

        // creacion de productos

        Producto producto[] = new Producto[4];
        producto[0] = new Camara("Sony", "La Cámara 4K HDR Sony Vlog de Lentes Intercambiables\n - ZV-E10L está diseñada para vlogueros creativos que buscan lograr una apariencia artística.\n La ZV-E10 se encarga de los aspectos técnicos de la producción de video.", "Digital", "0001", 2, 2620400, "Sony", "Alpha Kit ZV-E10");
        producto[1] = new Camara("Funjifilm", "La Instax Square 1 es una cámara instantánea \n que permite capturar momentos y obtener impresiones en formato cuadrado al instante.\n Esta cámara utiliza la película instantánea SQ de Fujifilm,\n que produce fotos cuadradas de 62 mm x 62 mm con una calidad de imagen nítida y clara.\n La cámara funciona con dos baterías CR2.", "Instantania", "0002", 1, 580000, "Funji", "Instax SQ1");
        producto[2] = new Impresion("Mi gato", "Foto de mi gato aslan", "clasica", "FTC", 1, 500, "color", obj1);
        producto[3] = new Impresion("Caratula", "IMG para CD tesis", "Laser", "FTL", 1, 1000, "color", obj1);

        // Crear factura
        System.out.println("Crear factura");
        System.out.println("Elige el cliente");
        for (int i = 0; i < cliente.length; i++) {
            System.out.println(i + ". " + cliente[i].getNombre());
        }

        int opcion = Scanner.nextInt();
        Cliente seleccionado = cliente[opcion];

        System.out.println("Cuántos productos desea facturar:");
        int cantidad = Scanner.nextInt();
        Producto[] producSelec = new Producto[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Elige producto #" + (i + 1) + ":");
            for (int j = 0; j < producto.length; j++) {
                System.out.println(j + ". Nombre: " + producto[j].getNombre() + " - Precio: $" + producto[j].getPrecio());
            }
            int indiceProducto = Scanner.nextInt();
            producSelec[i] = producto[indiceProducto];
            producSelec[i].aplicarDescuento(); // Aplica descuento en ese momento
        }

        // Fecha actual
        Date fecha = new Date();

        // Número de tarjeta
        System.out.println("Ingresa número de tarjeta:");
        int numeroTargeta = Scanner.nextInt();

        // Crear pedido
        Pedido pedido = new Pedido(seleccionado, producSelec, fecha, numeroTargeta);

        // Mostrar factura completa
        System.out.println("\n*************** FACTURA ***************");
        System.out.println("Cliente: " + seleccionado.getNombre());
        System.out.println("Teléfono: " + seleccionado.getTelefono());
        System.out.println("Dirección: " + seleccionado.getDireccion());
        System.out.println("Correo: " + seleccionado.getEmail());
        System.out.println("Identificación: " + seleccionado.getCedula());
        System.out.println("Fecha: " + fecha);
        System.out.println("----------------------------------------");

        double totalSinDescuento = 0;
        double totalConDescuento = 0;

        for (Producto p : producSelec) {
            double precioOriginal = p.getPrecio() * p.getCantidad();
            double precioFinal = p.getTotalConDescuento();

            System.out.println("- " + p.getNombre());
            System.out.println("  Precio original (x" + p.getCantidad() + "): $" + precioOriginal);
            System.out.println("  Precio con descuento: $" + precioFinal);
            System.out.println("----------------------------------------");

            totalSinDescuento += precioOriginal;
            totalConDescuento += precioFinal;
        }

        System.out.println("TOTAL SIN DESCUENTO: $" + totalSinDescuento);
        System.out.println("TOTAL A PAGAR (con descuento): $" + totalConDescuento);
        System.out.println("***************************************");

    }
}