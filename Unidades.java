package juegodeestrategia;

public abstract class Unidades {
	
	private int salud;
	
	public Unidades(int salud) {
		this.salud = salud;
	}

	public abstract void atacar(Unidades u);
	
	public abstract boolean puedenAtacar(Unidades u);
	
	public abstract void infringirDanio();
	
	public void recibirDanio(int danio) {
		this.salud -= danio;
	}
	
	public boolean unidadMuerta() {
		return salud == 0;
	}

}
