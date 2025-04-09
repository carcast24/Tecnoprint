import java.text.NumberFormat;
import java.util.Locale;

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
    public double getPrecioTotal (){
        return getCantidad() * getPrecio();
    }

    // poner formato al precio
    public String formatearPrecio(double precio) {
        NumberFormat formatoColombiano = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        return formatoColombiano.format(precio);
    }


    // ToString

    public String toString () {

        // condicional para mostrar el descuento si se ha hecho

        String precioTotalStr;

        if (totalConDescuento != -1) {
            precioTotalStr = "Pago total con descuento: " + formatearPrecio(totalConDescuento);
        } else {
            precioTotalStr = "Precio total: " + formatearPrecio(getPrecio() * getCantidad());
        }

        return "*** Informacion del Producto *** \n " +
                "--------------------------------" + "\n" +
                "Nombre:  " + getNombre() + "\n" +
                "Descripcion: " + getDescripcion() + "\n" +
                "Categoria: " + getCategoria() + "\n" +
                "Codigo: " + getCodigo() + "\n" +
                "Precio unitario: " + formatearPrecio(getPrecio()) + "\n" +
                "Cantidad: " + getCantidad() + "\n" +
                "Precio total: " + formatearPrecio(getPrecioTotal()) + "\n" +
                 precioTotalStr + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo " + modelo + "\n" +
                "--------------------------------";
    }

   

}