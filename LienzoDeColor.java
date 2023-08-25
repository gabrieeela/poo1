package finalDic2022;

public class LienzoDeColor {
	
	private Color[][] lienzo;
	private Color pincel;
	
	
	public LienzoDeColor(Color[][] lienzo, Color pincel) {
		this.lienzo = lienzo;
		this.pincel = pincel;
	}


/*	public Color[][] getLienzo() {
		return lienzo;
	}

	public void setLienzo(Color[][] lienzo) {
		this.lienzo = lienzo;
	}

	public Color getPincel() {
		return pincel;
	}

	public void setPincel(Color pincel) {
		this.pincel = pincel;
	} */


	public void pintarLienzo(Color[][] lienzo, Color pincel) {
		int n = lienzo.length;
		
		for(int i = 0; i < lienzo.length; i++) {
			lienzo[0][1] = pincel;
			lienzo[n-1][1] = pincel;
			lienzo[1][0] = pincel;
			lienzo[1][n-1] = pincel;
			
		}
	}

}
