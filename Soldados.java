package juegodeestrategia;

/* Los soldados pueden atacar cuerpo a cuerpo a otras unidades si tienen suficiente energía. 
 * Cada ataque les consume 10 puntos de energía, y comienzan con 100. 
 * Restauran energía si reciben la ración de agua. 
 * Infringen un daño de 10 puntos y comienzan con 200 de salud.
 */

public class Soldados extends Unidades {
	
	private int energia = 100;
	
	public Soldados(int salud, int energia) {
		super(200);
		this.energia = energia;
	}

	@Override
	public void atacar(Unidades u) {
		energia -= 10;
		
	}

	@Override
	public boolean puedenAtacar(Unidades u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void infringirDanio() {
		recibirDanio(10);
	}
	

}
