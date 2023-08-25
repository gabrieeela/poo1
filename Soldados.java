package juegodeestrategia;

/* Los soldados pueden atacar cuerpo a cuerpo a otras unidades si tienen suficiente energ�a. 
 * Cada ataque les consume 10 puntos de energ�a, y comienzan con 100. 
 * Restauran energ�a si reciben la raci�n de agua. 
 * Infringen un da�o de 10 puntos y comienzan con 200 de salud.
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
