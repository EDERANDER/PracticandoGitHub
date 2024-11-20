public class Gerente {
    private String nombre;
    private String telefono;

    public Gerente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        System.out.println("Se agrego correctamente al sistema");
    }

    public void informacion() {
        System.out.println(nombre);
        System.out.println(telefono);
    }
}