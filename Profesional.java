package consultorios;

public abstract class Profesional implements Comparable<Profesional> {
	
	private String nombre;
	private String apellido;
	private static double HONORARIO_BASICO = 100000;

	public Profesional(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public double getSalario() {
		return HONORARIO_BASICO;
	}
	
	public int compareTo(Profesional p) {
		return (-1) * Double.compare(this.getSalario(), p.getSalario());
	}

}
