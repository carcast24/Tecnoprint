import java.util.Date;

public class EjecutarTecnoPrint {
    public static void main (String [] args){

        // creacion de clientes
        Cliente cliente[] = new Cliente[2];
        cliente[0] = new Cliente("Daniel", "3024558789 ", "CRA 35B # 125 48", "daniel@gmail.com", "548557898");
        cliente[1] = new Cliente("Sebastian", "3054448789 ", "CRA 65 # 44 02", "sebastian@gmail.com", "66925465");
        // creacion de fotos
        Foto obj1[] = new Foto[2];
        obj1[0] = new Foto("200p","JPG");
        obj1[1] = new Foto("300p", "ISO");
        
        // creacion de productos 

        Producto producto[] = new Producto[4];
        producto[0] = new Camara("Sony", "La Cámara 4K HDR Sony Vlog de Lentes Intercambiables\n - ZV-E10L está diseñada para vlogueros creativos que buscan lograr una apariencia artística.\n La ZV-E10 se encarga de los aspectos técnicos de la producción de video.", "Digital", "0001", 2, 2620400, "Sony", "Alpha Kit ZV-E10");
        producto[1] = new Camara("Funjifilm", "La Instax Square 1 es una cámara instantánea \n que permite capturar momentos y obtener impresiones en formato cuadrado al instante.\n Esta cámara utiliza la película instantánea SQ de Fujifilm,\n que produce fotos cuadradas de 62 mm x 62 mm con una calidad de imagen nítida y clara.\n La cámara funciona con dos baterías CR2.", "Instantania", "0002", 1, 580000, "Funji", "Instax SQ1");
        producto[2] = new Impresion("Mi gato", "Foto de mi gato aslan", "clasica", "FTC", 1, 500, "color", obj1);
        producto[3] = new Impresion("Caratula", "IMG para CD tesis", "Laser", "FTL", 1, 1000, "color", obj1);

    }
}
