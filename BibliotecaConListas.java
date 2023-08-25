package listas;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class BibliotecaConListas {

	private ArrayList<Libro> libros;
	private int cantLibros = 0;
	
//	1. Se construya a partir de la máxima cantidad de libros que puede contener.
	public BibliotecaConListas() {
		this.libros = new ArrayList<Libro>();
	}
	
//	2. Se pueda consultar la cantidad de libros que contiene.
	public int cuantosLibros(){
		return this.libros.size();
	}

//	3. Se pueda agregar un libro indicando su título, autor, Genero y cantidad de páginas, siempre y cuando haya
//	lugar en la Biblioteca. Los Generos literarios que le gustan a éste bibiotecario son: POESIA, CIENCIAFICION, AVENTURA, NOVELA, HISTORIA, INFANTILES.

	public boolean agregarLibro(String titulo, String autor, Genero genero, int paginas){
		libros.add(new Libro(titulo, autor, genero, paginas));
		return true;
	}

//  4. Devuelva una lista con todos los libros de determinado genero que se pasa por parametro
	public ArrayList<Libro> librosDelGenero(Genero genero){
		ArrayList<Libro> listGenero = new ArrayList<Libro>();
		
		for(Libro cadaLibro : this.libros) {
			if(cadaLibro.getGenero().equals(genero))
				listGenero.add(cadaLibro);
		}
		return listGenero;
	}
//	4. Devuelva el título de un libro a partir de la posición.
/*	public String libroEnLaPosicion(int posicion){
		if(posicion < 1 || posicion > this.cuantosLibros())
			throw new Error("posicion invalida");
		return libros.get(posicion).getTitulo();
	} */

//	5. Devuelva el libro con más cantidad de páginas.
	public Libro libroConMasPaginas(){
		Libro libroConMasPaginas = libros.get(0);
		
		for(int l = 1; l < this.cuantosLibros(); l++) {
			if(libros.get(l).getCantPaginas() > libroConMasPaginas.getCantPaginas()) {
				libroConMasPaginas = libros.get(l);
			}
		}
		
		return libroConMasPaginas;
	}

//	6. Se pueda consultar cuantos libros hay de determinado autor.
	public int cuantosLibrosDelAutor(String autor){
		int contador = 0;
		
		for(Libro cadaLibro : this.libros) {
			if(cadaLibro.getAutor().equals(autor)) //comparar strings
				contador ++;
		}
		return contador;
	}
	
//	7. Devuelva una lista con todos los Libros de un autor que se pasa por parámetro.
	public LinkedList<Libro> librosDelAutor(String autor){
		int cantLibrosDelAutor = cuantosLibrosDelAutor(autor);
		LinkedList<Libro> aux = new LinkedList<Libro>();
	
		for(Libro cadaLibro : this.libros) {
			if(cadaLibro.getAutor().equals(autor)) //comparar strings
				aux.add(cadaLibro);
		}
		return aux;
	}
	
//	8. Calcule el tiempo (en minutos) que llevaría leer todos los libros, asumiendo que se tarda 1 minuto por página

	public int tiempoEnLeerTodosLosLibros(){
		int contTiempo = 0;
		for(Libro cadaLibro : this.libros) {
			contTiempo += cadaLibro.getCantPaginas();
		}
		
		return contTiempo;
	}
	
//	9. Informe por pantalla la cantidad de libros que hay por cada Genero literario.
	public Map<Genero, Integer> librosPorGenero(){
		Map<Genero, Integer> mapGenero = new TreeMap<Genero, Integer>();
		Genero key;
		Integer value;
		
		for(Libro cadaLibro : this.libros) {
			key = cadaLibro.getGenero();
			
			if(mapGenero.containsKey(key)) {
				value = mapGenero.get(key);
				mapGenero.put(key, value);
			}
		}
		return mapGenero;
		
	}
/*	public void librosPorGeneroLiterario(){
		Genero[] generos = Genero.values(); //values: me deja ver los generos
		int[] contadores = new int[generos.length];
		
		for(Libro cadaLibro : this.libros) {
			contadores[cadaLibro.getGenero().ordinal()]++; // ordinal: posicion que ocupa en el enum dicho genero
		}
		
		for(int l = 0; l < generos.length; l++) {
			if(contadores[l] != 0) {
				System.out.println(generos[l] + " " + contadores[l]);
			}
		}
	} */
}
