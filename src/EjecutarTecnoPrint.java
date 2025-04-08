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


    }
}
