package libros;

public class Biblioteca {
	
	private Libro[] libros;
	private int cantLibros = 0;
	private int libroConMasPaginas = 0;
	
//	1. Se construya a partir de la máxima cantidad de libros que puede contener.
	public Biblioteca (int maxCantidadDeLibros) {
		this.libros = new Libro[maxCantidadDeLibros];
	}
	
//  2. Se pueda consultar la cantidad de libros que contiene.
	public int cuantosLibros(){
		return this.cantLibros;
	}
	
//  3. Se pueda agregar un libro indicando su título, autor, Genero y cantidad de páginas,
//	siempre y cuando haya lugar en la Biblioteca. 

    public boolean agregarLibro(String titulo, String autor, Genero genero, int cantPaginas){
    	if(cantLibros < getMaxCantDeLibros()) {
    		libros[cantLibros] = new Libro(titulo, autor, genero, cantPaginas);
    	    setLibroConMasPaginas();
    	    cantLibros ++;
    	    return true;
    	}
    	
    	return false;
    } 
    
    private void setLibroConMasPaginas() {
    	if(libros[cantLibros].getCantPaginas() > libros[libroConMasPaginas].getCantPaginas())
    		this.libroConMasPaginas = this.cantLibros;
	
    }

	public int getMaxCantDeLibros() {
    	return this.libros.length;
    }

//  4. Devuelva el título de un libro a partir de la posición.
    public String libroEnLaPosicion(int posicion){
    	if(posicion < 1 || posicion > this.cantLibros)
    		throw new Error("posicion incorrecta");
    	
    	return libros[posicion - 1].getTitulo();
   	} 
    
//  5. Devuelva el libro con más cantidad de páginas.
    public Libro libroConMasPaginas(){
    	return libros[libroConMasPaginas];
    }
    
//  6. Se pueda consultar cuantos libros hay de determinado autor.
    public int cuantosLibrosDelAutor(String autor){
    	int contLibrosDelAutor = 0;
    	for(int l = 0; l < this.cantLibros; l++)
    		if(libros[l].getAutor().equals(autor))
    			contLibrosDelAutor++;
    	
    	return contLibrosDelAutor;
    }
    
//  7. Devuelva un arreglo con todos los Libros de un autor que se pasa por parámetro.
    public Libro [] librosDelAutor(String autor){
    	int arregloDeLibrosDelAutor = this.cuantosLibrosDelAutor(autor);
    	int contLibros = 0;
    	Libro librosDelAutor[] = new Libro[arregloDeLibrosDelAutor];
    	
    	for(int l = 0; l < this.cantLibros; l++) {
    		if(libros[l].getAutor().equals(autor)) {
    			librosDelAutor[contLibros] = libros[l];
    	        contLibros++;
    		}
    	}
    	
    	return librosDelAutor;
    }
    
//  8. Calcule el tiempo (en minutos) que llevaría leer todos los libros, asumiendo que se tarda 1 minuto por página.
    public int tiempoEnLeetTodosLosLibros(){
    	int contTiempo = 0;
    	for(int l = 0; l < this.cantLibros; l++)
    		contTiempo += libros[l].getTiempoEnLeer();
    	
    	return contTiempo;
    }
    
//  9. Informe por pantalla la cantidad de libros que hay por cada Genero literario.
    public void librosPorGeneroLiterario() {
    	for(int l = 0; l < Genero.values().length; l ++) {
    		System.out.println(Genero.values()[l] + ": " + this.librosPorGenero()[l]);
    	}
    }
    
    public int[] librosPorGenero(){
    	int contGenero[] = {0, 0, 0, 0, 0, 0};
    	
    	for(int l = 0; l < this.cantLibros; l++) {
    		if(libros[l].getGenero() == Genero.AVENTURA) {
    			contGenero[0]++;
    		}
    		if(libros[l].getGenero() == Genero.CIENCIA_FICCION) {
    			contGenero[1]++;
    		}
    		if(libros[l].getGenero() == Genero.HISTORIA) {
    			contGenero[2]++;
    		}
    		if(libros[l].getGenero() == Genero.INFANTILES) {
    			contGenero[3]++;
    		}
    		if(libros[l].getGenero() == Genero.NOVELA) {
    			contGenero[4]++;
    		}
    		if(libros[l].getGenero() == Genero.POESIA) {
    			contGenero[5]++;
    		}
    	}
		return contGenero;
    	    
    	
    } 

}
