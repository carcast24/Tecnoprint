public class Impresion extends Producto {
    // atributos 
    private String color;
    private Foto [] foto; //composicion 

    // constructor

    public Impresion(String nombre, String descripcion, String categoria, String codigo, int cantidad, double precio, String color, Foto [] foto){
        super(nombre,descripcion,categoria,codigo,cantidad,precio); // herencia de superclase Producto
        this.color = color;
        this.foto = foto;
    }

    // getter

    public String getColor (){
        return color;
    }

    public Foto[] getFoto () {
        return foto;
    }

}