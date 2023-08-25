package segundoparcial1c;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Infractores {

	private Map<String, Integer> infractores = new HashMap<String, Integer>();
	private static final int VELOCIDAD_MAXIMA = 80;

	public void leerInfractores(String entrada) {
		try {
			FileReader fr = new FileReader(new File(entrada));
			BufferedReader br = new BufferedReader(fr);
			String linea;
			String datos[];
			String patente;
			int velocidad;
			
			linea = br.readLine();
			
			while(linea != null) {
				datos = linea.split(" ");
				patente = datos[0];
				velocidad = Integer.parseInt(datos[1]);
				linea = br.readLine();
				
				if(velocidad >= VELOCIDAD_MAXIMA) {
					int cantidad = 1;
					
					if(infractores.containsKey(patente))
						cantidad = infractores.get(patente) + 1;
					
					infractores.put(patente, cantidad);
				}
			}
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println(entrada);
		}
	}

	public void escribirMultados(String salida) {
		PrintWriter pr;
		try {
			pr = new PrintWriter(new File(salida));
			for(Map.Entry<String, Integer> infractor : infractores.entrySet()) {
				pr.println(infractor);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {

		Infractores infractores = new Infractores();
		infractores.leerInfractores("infractores.in");
		infractores.escribirMultados("multados.out");
	}

}
