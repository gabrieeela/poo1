package juegodeestrategia;

public class Lanceros extends Unidades {
	
	/* Los lanceros pueden atacar a una distancia de 1 a 3, sin condición. 
	 * Infringen un daño de 25 puntos, y comienzan con 150 de salud.
	 */

	public Lanceros(int salud) {
		super(150);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar(Unidades u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean puedenAtacar(Unidades u) {
		int distancia = 0;
		if(distancia > 1 && distancia < 3)
			atacar(u);
			return true;
	}

	@Override
	public void infringirDanio() {
		recibirDanio(25);
	}

}
