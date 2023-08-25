package segundoparcial1c;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ventas {

	private Map<String, Integer> ventasPorProducto = new HashMap<String, Integer>();
	
	public void leerVentas(String entrada) {
		try {
			FileReader fr = new FileReader(new File(entrada));
			BufferedReader br = new BufferedReader(fr);
			String linea;
			String datos[];
			String codigoDeProducto;
			int cantidadTotalVendido;
			linea = br.readLine();
			
			while(linea != null) {
				datos = linea.split(" ");
				codigoDeProducto = datos[0];
				cantidadTotalVendido = Integer.parseInt(datos[1]);
				linea = br.readLine();
				
				if(cantidadTotalVendido <= 0 || cantidadTotalVendido >= 1000) {
					int cantidad = 1;
					if(ventasPorProducto.containsKey(codigoDeProducto))
						cantidad = ventasPorProducto.get(codigoDeProducto);
					cantidad++;
					ventasPorProducto.put(codigoDeProducto, cantidad);
				}
			} fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println(entrada);
		}
	}
	
	public void escribirVentas(String salida) throws IOException {
		PrintWriter pr = new PrintWriter(new FileWriter(salida));
		
		for(Entry<String, Integer> cu : ventasPorProducto.entrySet()) {
			String key = cu.getKey();
			Integer value = cu.getValue();
		}
		
		pr.close();
	} 
}
