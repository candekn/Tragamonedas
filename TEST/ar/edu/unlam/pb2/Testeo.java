package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testeo {

	@Test
	public void testDeTamborQueEsteEnElRango() {
		Tambor miTambor = new Tambor();
		miTambor.girar();
		assertTrue((miTambor.getCara()>0&&miTambor.getCara()<=9));
	}
	@Test
	public void testDeTragamoneda() {
		Tragamonedas test1 = new Tragamonedas(325, 5, 250);
		test1.jugar(100);
		test1.mostrarJugada();
	}

}
