package primerparcialtn;

public abstract class Figura implements Comparable <Figura> {
	
	private double area;

	public Figura(double area) {
		this.area = area;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}

	public int compareTo(Figura f) {
		return Double.compare(this.getArea(), f.getArea());
	}

}
