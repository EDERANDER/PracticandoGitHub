public class Gerente {
    private String nombre;
    private String telefono;

    public Gerente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void informacion() {
        System.out.println("Mensaje de informacion");
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
    }

    public void mensaje() {
        System.out.println("Yo soy el gerente y me respetan");
        System.out.println("Gerente enfurecido");
    }
}