package juegodeestrategia;

public class Caballeros extends Unidades implements Agua {

	/*Los caballeros pueden atacar a una distancia de 1 a 2, siempre que su caballo no se haya puesto rebelde. 
	 * Infringe un daño de 50 puntos y comienza con 200 de salud. 
	 * Un caballo se pone rebelde luego de 3 ataques, y puede calmarse si recibe una ración de agua.
	 */
	
	public Caballo caballito;
	
	public Caballeros(int salud, Caballo caballito) {
		super(salud);
		this.caballito = caballito;
	}

	@Override
	public void atacar(Unidades u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean puedenAtacar(Unidades u) {
		int distancia = 0;
		if(distancia > 1 && distancia < 2)
			atacar(u);
			return true;
	}

	@Override
	public void infringirDanio() {
		recibirDanio(50);
	}

	@Override
	public void beberAgua() {
		// TODO Auto-generated method stub
		
	}

}
