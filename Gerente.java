public class Gerente {
    private String nombre;
    private String telefono;

    public Gerente(String nombre, String telefono) {
        System.out.println("Constructor creado");
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void informacion() {
        System.out.println("Mensaje de informacion del gerente");
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
    }

    public void mensaje() {
        System.out.println("Yo soy el gerente y me respetan");
        System.out.println("Gerente enfurecido");
    }

    public double sueldo() {
        System.out.println("Sueldo del Gerente perro: ");
        return 2000;
    }
}