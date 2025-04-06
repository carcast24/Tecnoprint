public class Producto {
    //atributos
    private String nombre;
    private String descripcion;
    private String categoria;
    private String codigo;
    private int cantidad;
    private double precio;

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
}
