package repasoFinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Rating {
	
	private Set<Programa> programas = new TreeSet<Programa>();
	
	public void leerRatings(String archivoDeEntrada) {
		try {
			FileReader fr = new FileReader(new File(archivoDeEntrada));
			BufferedReader br = new BufferedReader(fr);
			String linea;
			String datos[];
			int numCanal;
			String nomPrograma;
			double numRating;
			Programa p;
			
			linea = br.readLine();
			
			while(linea != null) {
				datos = linea.split(",");
				numCanal = Integer.parseInt(datos[0]);
				nomPrograma = datos[1];
				numRating = Double.parseDouble(datos[2]);
				p = new Programa(numCanal, nomPrograma, numRating);
				linea = br.readLine();
			} fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 
	
	public void escribirMasVistos(String archivoDeSalida) throws IOException {
		PrintWriter pr = new PrintWriter(new FileWriter(archivoDeSalida));
		for(Programa cp : programas) {
			if(cp.getNumRating() >= 5) {
				pr.println(programas);
			}
		} pr.close();
	}
	
	public static void main(String[] args) throws IOException {
		Rating ratings = new Rating();
		ratings.leerRatings("ratings.in");
		ratings.escribirMasVistos("masVistos.out"); 
	}

}
