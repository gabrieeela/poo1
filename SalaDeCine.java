package cine;

public class SalaDeCine {
	
	private boolean [][] sala;
	
	//Crearla con la cantidad de butacas totales, y cantidad de filas.
	public SalaDeCine(int butacas, int filas) {
		sala = new boolean[butacas][filas];
	}
	
	//Consultar si una butaca está ocupada (referida por fila y asiento).
	public boolean estaOcupada(int fila, int asiento) {
		return sala[fila][asiento];
	}
	
	//Ocupar una butaca determinada, siempre que ésta no esté previamente ocupada.
	public void ocuparButaca(int fila, int asiento) {
		if(!sala[fila][asiento]) {
			sala[fila][asiento] = true;
			
		}
		else{
			System.err.print("butaca ocupada");
		}
	}
	
	//Consultar la cantidad total de butacas ocupadas.
	public int cantidadDeButacasOcupadas() {
		int contButacas = 0;
		for(int i = 0; i < sala.length; i++)
			for(int j = 0; j < sala[i].length; j++)
				if(estaOcupada(i, j)) {
					contButacas ++;
				}
		return contButacas;
	}
	
	//Consultar si es posible acomodar a un grupo de X personas, en forma contigua, en la misma fila.
	public boolean hayEspacioPara(int cantidadDePersonas) {
		int contButacasDesocupadas = 0;
		for(int i = 0; i < sala.length; i++) {
			for(int j = 0; j < sala[i].length; j++) {
				if(!estaOcupada(i, j))
					contButacasDesocupadas ++;
				else
					contButacasDesocupadas = 0;
				if(contButacasDesocupadas == cantidadDePersonas)
					return true;
			}
		}
	
		return true;
	}
	
	public boolean lugaresContiguosLibresEnLaFila(int fila, int cantidadDePersonas) {
		int contadorLugaresLibres = 0;
		int j = 0;
		while (contadorLugaresLibres < cantidadDePersonas && j < sala[fila].length) {
			
			if (sala[fila][j]) {
				contadorLugaresLibres = 0;
			} else {
				contadorLugaresLibres++;
			}
			j++;
		}
		return (contadorLugaresLibres >= cantidadDePersonas);
	}

}
