package finalDic2022;

public class PonyExpress {
	
	public int caballos(int [] distancias) throws RutaInvalidaException {
		int cantCaballos = 0;
		int acumDistancias = 0;
		
		try {
			if(distancias[0] >= 100)
				throw new RutaInvalidaException("las distancias superan las 100 millas");
			
			else 
				acumDistancias ++;
		}
		
		catch (RutaInvalidaException rie) {
			System.err.println(rie.getMessage());
		}
//	    
		
	    while(acumDistancias > distancias.length){
//		for(int i = 0; i > distancias.length; i++) {
			if(acumDistancias >= 100)
				cantCaballos ++;
		} 
		return cantCaballos; 
		
	} 

}
