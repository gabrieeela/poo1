package repasoFinal;

public class Programa implements Comparable<Programa> {
	
	private int numCanal;
	private String nomPrograma;
	private double numRating;

	public Programa(int numCanal, String nomPrograma, double numRating) {
		this.numCanal = numCanal;
		this.nomPrograma = nomPrograma;
		this.numRating = numRating;
	}

	public int getNumCanal() {
		return numCanal;
	}

	public String getNomPrograma() {
		return nomPrograma;
	}

	public double getNumRating() {
		return numRating;
	}

	@Override
	public String toString() {
		return "[" + numCanal + nomPrograma + numRating + "]";
	}

	@Override
	public int compareTo(Programa p) {
		return Double.compare(this.numRating, p.numRating);
	}
	
	

}
