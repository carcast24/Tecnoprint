public class Camara extends Producto {
    // atributos de clase 
    private String marca;
    private String modelo;

    // constructor de clase con herencia de superclase 

    public Camara (String nombre, String descripcion, String categoria, String codigo, int cantidad, double precio, String marca, String modelo){
        super (nombre, descripcion, categoria, codigo, cantidad,precio);
        this.marca = marca;
        this.modelo = modelo;
    }

    // getter

    public String getMarca () {
        return marca;
    }

    public String getModelo () {
        return modelo;
    }

   

}