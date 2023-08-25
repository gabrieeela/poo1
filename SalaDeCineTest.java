package cine;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalaDeCineTest {

	@Test
	public void crearSalaTest() {
		SalaDeCine nuevaSala = new SalaDeCine(8, 5);
		assertNotNull(nuevaSala);
	}
	
	@Test
	public void butacasOcupadasTest() {
		SalaDeCine nuevaSala = new SalaDeCine(8, 5);
		nuevaSala.ocuparButaca(1, 4);
		nuevaSala.ocuparButaca(2, 3);
		nuevaSala.ocuparButaca(4, 4);
		assertTrue(nuevaSala.estaOcupada(1, 4));
		assertTrue(nuevaSala.estaOcupada(2, 3));
		assertTrue(nuevaSala.estaOcupada(4, 4));
		assertEquals(3, nuevaSala.cantidadDeButacasOcupadas());
	}
	
	@Test (expected = Error.class)
	public void ocuparButacaOcupadaTest() {
		SalaDeCine nuevaSala = new SalaDeCine(8, 5);
		nuevaSala.estaOcupada(1, 4);
		assertFalse(nuevaSala.estaOcupada(1, 4));
		assertEquals(1, nuevaSala.cantidadDeButacasOcupadas());
	}

}
