public class Cliente {
    // Atributos
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;
    private String cedula;

    // Constructor
    public Cliente(String nombre, String telefono, String direccion, String email, String cedula){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.cedula = cedula;
    }

    //getter
    public String getNombre(){
        return nombre;
    }

    public String getTelefono(){
        return telefono;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getEmail(){
        return email;
    }

    public String getCedula() {
        return cedula;
    }

    public String toString(){
        return "------------------------------\n" +
                " Nombre: " + nombre + "\n" +
                " Telefono: " + telefono + "\n" +
                " Direccion: " + direccion + "\n" +
                " Email: " + email + "\n" +
                " Cedula: " + cedula + "\n" +
                "-----------------------------";
    }
    // metodo actualizacion de cliente

    public void actualizarCliente(String nuevoNombre, String nuevoTelefono, String nuevaDireccion, String nuevoEmail,String nuevaCedula){
        if (nuevoNombre == null || nuevoNombre.trim().isEmpty()){ // trim() elimina espacios en blanco y isEmpty valida si esta en blanco
            System.out.println("El nombre es invalido, confirme por favor");
            return;
        }
        if (nuevoTelefono == null || nuevoTelefono.trim().isEmpty()){
            System.out.println("El Telefono es invalido, confirme por favor");
            return;
        }
        if (nuevaDireccion == null || nuevaDireccion.trim().isEmpty()){
            System.out.println("La nueva Direccion es invalida, confirme por favor");
            return;
        }
        if (nuevoEmail == null || nuevoEmail.trim().isEmpty()){
            System.out.println("El Email es invalido, confirme por favor");
            return;
        }
        if(nuevaCedula == null || nuevaCedula.trim().isEmpty()){
            System.out.println("La Cedula ingresada no es valida");
            return;
        }
        this.nombre = nuevoNombre;
        this.telefono = nuevoTelefono;
        this.direccion = nuevaDireccion;
        this.email = nuevoEmail;
        this.cedula = nuevaCedula;

    }
}
