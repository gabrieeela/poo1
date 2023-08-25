package juegodeestrategia;

public class Caballo implements Agua {
	
	private boolean rebelde = false;
	private int ataques = 0;

	public boolean isRebelde() {
		return rebelde;
	}

	public void setRebelde(boolean rebelde) {
		this.rebelde = rebelde;
	}

	public int getAtaques() {
		return ataques;
	}

	public void setAtaques(int ataques) {
		this.ataques = ataques;
	}
	
	public void incrementarAtaque() {
		this.setAtaques(getAtaques() + 1);
	}

	@Override
	public void beberAgua() {
		this.setRebelde(rebelde);
		this.setAtaques(3);
		
	}

}
