
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Producto {
    //atributos
    private String nombre;
    private String descripcion;
    private String categoria;
    private String codigo;
    private int cantidad;
    private double precio;
    protected double totalConDescuento =-1; // uso el protected para que este atributo sea visible para las subclases


    // constructor

    public Producto(String nombre, String descripcion, String categoria, String codigo, int cantidad, double precio){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    //getter

    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getCategoria () {
        return categoria;
    }
    public String getCodigo() {
        return codigo;
    }
    public int getCantidad () {
        return cantidad;
    }
    public double getPrecio () {
        return precio;
    }
    public String formatearPrecio(double precio) {
        NumberFormat formatoColombiano = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        return formatoColombiano.format(precio);
    }

    public double getTotalConDescuento() {
        return totalConDescuento;
    }

    // metodo para actualizar producto
    public void actualizarProducto(String nuevoNombre, String nuevaDescripcion, String nuevaCategoria, String nuevoCodigo, int nuevaCantidad, double nuevoPrecio){
        if (nuevoNombre == null || nuevoNombre.trim().isEmpty()) {
            System.out.println("El nombre no puede ir vacio, por favor ingresa uno");
            return;
        }
        if (nuevaDescripcion == null || nuevaDescripcion.trim().isEmpty()){
            System.out.println("La descripcion no puede estar vacia, por favor digita una bien chimbita");
            return;
        }
        if (nuevaCategoria == null || nuevaCategoria.trim().isEmpty()){
            System.out.println("La categoria no puede ir vacia, ingresa una");
            return;
        }
        if (nuevoCodigo == null || nuevoCodigo.trim().isEmpty()){
            System.out.println("El codigo es necesario, no puede ir vacio, ingresa uno");
            return;
        }
        if (nuevaCantidad <= 0){
            System.out.println("La cantidad es necesaria, no puede ser negativa, ingresa un valor valido");
            return;
        }
        if (nuevoPrecio <= 0){
            System.out.println("El precio debe de ser mayor a cero");
            return;
        }
        this.nombre = nuevoNombre;
        this.descripcion = nuevaDescripcion;
        this.categoria = nuevaCategoria;
        this.codigo = nuevoCodigo;
        this.cantidad = nuevaCantidad;
        this.precio = nuevoPrecio;

    }

    // metodo to string

    public String toString(){
        return   " " +
                "Informacion del producto \n" +
                "Nombre: " + nombre + "\n" +
                "Descripcion: " + descripcion + "\n" +
                "Categoria: " + categoria + "\n" +
                "Codigo: " + codigo + "\n" +
                "Cantidad: " + cantidad + "\n" +
                "Precio: " + formatearPrecio(precio) + "\n" +
                "***************************";
    }

    // metodo para aplicar un descuento
    public void aplicarDescuento(){
        Scanner scanner = new Scanner(System.in); // me sirve para que el usuario ingrese el porcentaje
        System.out.println("ingresa el porcentaje que deseas otorgar");
        double porcentaje = scanner.nextDouble(); // asigno el tipo de dato que recibe en este caso un scaner de tipo double

        // agrego un condicional para controlar el dato y no ingresen datos ilogicos como negativos
        if (porcentaje <= 0 || porcentaje > 100){
            System.out.println("El porcentaje debe de ser de 1 al 100");
            return;
        }
        // aplicamos el descuento al precio total
        double total = getPrecio() * getCantidad(); // calculo el total
        double descuento = total * (porcentaje / 100); // encuentro el descuento
        double totalConDescuento = total - descuento; // y aqui lo asigno para actualizar el precio

        // guardo el total del descuento en el atributo protected
        this.totalConDescuento = totalConDescuento;

        System.out.println("El precio total es_ " + formatearPrecio(total));
        System.out.println("El descuento aplicado es:  " + formatearPrecio(descuento));
        System.out.println("El nuevo precio es:  " + formatearPrecio(totalConDescuento));
        

    }




}
