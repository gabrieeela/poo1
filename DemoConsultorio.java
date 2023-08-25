package consultorios;

import java.util.Arrays;

public class DemoConsultorio {
	
	public static void main(String[] args) {
		Dentista silvia = new Dentista("Silvia", "Perez");
		Medico juan = new Medico("Juan", "Lopez");
		Cirujano luis = new Cirujano("Luis", "Alvarez");
//		Endodoncista carla = new Endodoncista("Carla", "Fernandez");
		CirujanoCardiovascular ciro = new CirujanoCardiovascular("Ciro", "Latidos");

		Profesional [] profesionales = {silvia, juan, luis, ciro};
		
		double montoTotal = 0;
		
		for(Profesional cadaProfesional : profesionales) {
			montoTotal += cadaProfesional.getSalario();
		}
		System.out.println("Monto total a abonar por salario: " + montoTotal);
		
		for(Profesional cadaProfesional : profesionales) {
			System.out.println(cadaProfesional.getSalario());
		}
		Arrays.sort(profesionales);
		System.out.println("Ordenados de mayor a menor salario");
	}


}
