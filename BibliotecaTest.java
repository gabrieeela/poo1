package libros;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {

	@Test
	public void constructorTest() {
		Biblioteca miBiblioteca = new Biblioteca(0);
		assertEquals(0, miBiblioteca.cuantosLibros());
	}
	
	@Test
	public void agregarLibrosTest() {
		Biblioteca miBiblioteca = new Biblioteca(2);
		miBiblioteca.agregarLibro("Dracula", "Bram Stocker", Genero.NOVELA , 800);
		miBiblioteca.agregarLibro("La Vuelta al mundo en 80 días", "Jules Verne", Genero.AVENTURA, 400);
		assertEquals(2, miBiblioteca.cuantosLibros());
	}
	
	@Test
	public void libroEnLaPosicionTest() {
		Biblioteca miBiblioteca = new Biblioteca(2);
		assertEquals(0, miBiblioteca.cuantosLibros());
		miBiblioteca.agregarLibro("Dracula", "Bram Stocker", Genero.NOVELA , 800);
		miBiblioteca.agregarLibro("La Vuelta al mundo en 80 días", "Jules Verne", Genero.AVENTURA, 400);
		assertEquals("La Vuelta al mundo en 80 días", miBiblioteca.libroEnLaPosicion(2));
	}
	
	@Test
	public void libroConMasPaginasTest() {
		Biblioteca miBiblioteca = new Biblioteca(2);
		miBiblioteca.agregarLibro("Dracula", "Bram Stocker", Genero.NOVELA , 800);
		miBiblioteca.agregarLibro("La Vuelta al mundo en 80 días", "Jules Verne", Genero.AVENTURA, 400);
		Libro esperado = new Libro("Dracula", "Bram Stocker", Genero.NOVELA, 800);
		Libro obtenido = miBiblioteca.libroConMasPaginas();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void consultarLibrosDelAutorTest() {
		Biblioteca miBiblioteca = new Biblioteca(10);
		assertEquals(0, miBiblioteca.cuantosLibros());
		miBiblioteca.agregarLibro("La Vuelta al mundo en 80 días", "Jules Verne", Genero.AVENTURA, 400);
		miBiblioteca.agregarLibro("Viaje al centro de la tierra", "Jules Verne", Genero.AVENTURA, 370);
		assertEquals(2, miBiblioteca.cuantosLibrosDelAutor("Jules Verne"));
	} 
	
	@Test
	public void librosDelAutorTest() {
		Biblioteca miBiblioteca = new Biblioteca(3);
		assertEquals(0, miBiblioteca.cuantosLibros());
		miBiblioteca.agregarLibro("Dracula", "Bram Stocker", Genero.NOVELA , 800);
		miBiblioteca.agregarLibro("La Vuelta al mundo en 80 días", "Jules Verne", Genero.AVENTURA, 400);
		miBiblioteca.agregarLibro("Viaje al centro de la tierra", "Jules Verne", Genero.AVENTURA, 370);
		Libro[] esperado = { new Libro("La Vuelta al mundo en 80 días", "Jules Verne", Genero.AVENTURA, 400), new Libro("Viaje al centro de la tierra", "Jules Verne", Genero.AVENTURA, 370) };
		assertArrayEquals(esperado, miBiblioteca.librosDelAutor("Jules Verne"));
	} 
	
	@Test
	public void tiempoEnLeerLosLibrosTest() {
		Biblioteca miBiblioteca = new Biblioteca(10);
		assertEquals(0, miBiblioteca.cuantosLibros());
		miBiblioteca.agregarLibro("Dracula", "Bram Stocker", Genero.NOVELA , 800);
		miBiblioteca.agregarLibro("La Vuelta al mundo en 80 días", "Jules Verne", Genero.AVENTURA, 400);
		miBiblioteca.agregarLibro("Viaje al centro de la tierra", "Jules Verne", Genero.AVENTURA, 370);
		assertEquals(1570, miBiblioteca.tiempoEnLeetTodosLosLibros());
	} 
	
	@Test
	public void librosPorGeneroLiterarioTest() {
		Biblioteca miBiblioteca = new Biblioteca(10);
		assertEquals(0, miBiblioteca.cuantosLibros());
		miBiblioteca.agregarLibro("La Vuelta al mundo en 80 días", "Jules Verne", Genero.AVENTURA, 400);
		miBiblioteca.agregarLibro("Viaje al centro de la tierra", "Jules Verne", Genero.AVENTURA, 370);
		int esperado = 2;
		int obtenido = miBiblioteca.librosPorGenero()[0];
		assertEquals(esperado, obtenido);
		
	} 

}
