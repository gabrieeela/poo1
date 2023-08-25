package juegodeestrategia;

public class Arqueros extends Unidades {

	/*Los Arqueros pueden atacar a una distancia de entre 2 y 5 respecto de su enemigo, y si tienen suficientes flechas. 
	 * Comienzan con 20 flechas en su carcaj, y pueden recargar si reciben un paquete de seis flechas. 
	 * Infringen un daño de 5 puntos, y comienzan con 50 de salud.
	 */
	
	public int cantFlechas;
	
	public Arqueros(int salud) {
		super(50);
	}

	@Override
	public void atacar(Unidades u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean puedenAtacar(Unidades u) {
		int distancia = 0;
		if(distancia > 2 && distancia < 5)
			atacar(u);
			return true;
	}

	@Override
	public void infringirDanio() {
		recibirDanio(5);
		
	}

}
