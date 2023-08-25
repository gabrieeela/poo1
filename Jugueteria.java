package repasoFinal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Jugueteria {
	
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private Set<String> nombres = new TreeSet<String>();
	private Queue<Empleado> listaDeEspera = new ArrayDeque<Empleado>();
	
// agrega al empleado a la lista de empleados y su nombre a la lista de empleados
	public void agregarEmpleado(Empleado e) {
		empleados.add(e);
		agregarNombre(e);
	}
	
// agrega el nombre del empleado al set de nombres
	public void agregarNombre(Empleado e) {
		nombres.add(e.getNombreCompleto());
	}

// devuelve al empleado que le entrega su juguete de regalo
	public Empleado elegirEmpleadoAlAzar() {
		Random empleadoRandom = new Random();
		int elegido = empleadoRandom.nextInt(empleados.size());
		return empleados.get(elegido);
	}
	
// devuelve una lista con los posibles nombres de los nuevos juguetes ordenados alfabeticamente
	public List<String> nombresDeNuevosJuguetes(){
		return new ArrayList<String>(nombres);
	}
	
// agrega empleado a la lista de espera
	public void ponerEnListaDeEspera(Empleado e) {
		listaDeEspera.add(e);
	}
	
// entrega entradas a todos sus empleados en lista de espera
	public void entregarEntradas() {
        while (!listaDeEspera.isEmpty()) {
            Empleado e = listaDeEspera.poll();
            System.out.println("Entrada engregada a " + e);
        }
	}
	
// entrega un archivo "nombresDeJuguetes.out" con los nombrs obtenidos
	public void listarNombres(List<String> nombres) throws IOException {
		PrintWriter pr = new PrintWriter(new FileWriter("nombresDeJuguetes.out"));
		for(String nombre : nombres) {
			pr.println(nombre);
		} pr.close();
	}

}
