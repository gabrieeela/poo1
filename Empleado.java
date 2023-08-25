package repasoFinal;

public class Empleado {

    private String nombre;
    private String apellido;
    private boolean entradaEntregada = false;


    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public String getNombre() {
        return nombre;
    }

    public String getNombreCompleto() {
        return this.toString();
    }


    public String getApellido() {
        return apellido;

    }

    public boolean isEntradaEntregada() {
        return entradaEntregada;
    }

    public String toString(){
        return this.getNombre() + " " + this.getApellido();

    }

}
