public class Foto {
    private String resolucion;
    private String formato;

    // constructor
    public Foto(String resolucion, String formato){
        this.resolucion = resolucion;
        this.formato = formato;
    }

    // getter

    public String getResolucion () {
        return resolucion;
    }
    public String getFormato () {
        return formato;
    }

    // toString

    public String toString () {
        return "----------------------------- \n" +
                "Resolucion: " + resolucion + " \n" +
                "Formato: " + formato + "\n" +
                "----------------------------";
    }

    // metodos actualizar

    public void actualizarFoto(String nuevaResolucion, String nuevoFormato){
        if (nuevaResolucion == null || nuevaResolucion.trim().isEmpty()) {
            System.out.println("La resolucion no puede ir vacia, por favor ingrese una");
            return;
        }
        if (nuevoFormato == null || nuevoFormato.trim().isEmpty()){
            System.out.println("El formato no puede ir vacio, por favor ingresa uno");
            return;
        }
        this.resolucion = nuevaResolucion;
        this.formato = nuevoFormato;
    }

    // a print
    public void print(){
        System.out.println("Imprimiendo...");
    }
}
