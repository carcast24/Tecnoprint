import java.util.Arrays;

public class Impresion extends Producto {
    // atributos 
    private String color;
    private Foto [] foto; //composicion 

    // constructor

    public Impresion(String nombre, String descripcion, String categoria, String codigo, int cantidad, double precio, String color){
        super(nombre,descripcion,categoria,codigo,cantidad,precio); // herencia de superclase Producto
        this.color = color;
        this.foto = new Foto[2];
        foto[0] = new Foto("200ppp","foto_carnet.jpg");
        foto[1] = new Foto("200ppp","foto_retrato.jpg");

    }

    // getter

    public String getColor (){
        return color;
    }

    public Foto[] getFoto () {
        return foto;
    }

    // ToString

    public String toString () {
        return "*** Informacion del Producto *** \n " +
                "--------------------------------" + "\n" +
                "Nombre:  " + getNombre() + "\n" +
                "Descripcion: " + getDescripcion() + "\n" +
                "Categoria: " + getCategoria() + "\n" +
                "Codigo: " + getCodigo() + "\n" +
                "Cantidad: " + getCantidad() + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "Color: " + color + "\n" +
                "Foto: " + Arrays.toString(foto) + "\n" +
                "--------------------------------";
    }

}