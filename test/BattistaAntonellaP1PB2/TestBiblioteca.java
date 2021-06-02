package BattistaAntonellaP1PB2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestBiblioteca {

	
	@Test
	public void queSePuedaCrearUnaBiblioteca() {
		
		Biblioteca bibliotecaTest = new Biblioteca(2);
		
		assertNotNull(bibliotecaTest);
		
	}
	
	
	
	@Test
	public void queSePuedaCrearUnLibro() {
		
		Historia antigua = new Historia("123","Historia Antigua","Carlos");
		
		assertTrue(antigua.getNombre() == "Historia Antigua");
	}

	@Test
	public void queSePuedaCrearUnEstudiante() {

		Estudiante antonella = new Estudiante(34999092,"Antonella","Battista");
		
		assertTrue(antonella.getApellido() == "Battista");
		
		
	}
	
	@Test
	public void queSoloSePuedanFotocopiarLosLibrosDeHistoria() {
		
		Biblioteca biblioteca = new Biblioteca(2);
		
		Historia antigua = new Historia("123","Historia Antigua","Carlos");
		Matematicas matematicas = new Matematicas("222","Matematica 2","Juan");
			
		assertTrue(biblioteca.imprimir(antigua) == "Fotocopiando Historia");
		assertNotNull(biblioteca.imprimir(matematicas) == "");
		
		
	}
	
	@Test
	public void queNoSePuedanPrestarMasDeDosLibrosEnSimultaneo() {

		Biblioteca biblioteca = new Biblioteca(3);

		Estudiante antonella = new Estudiante(34999092,"Antonella","Battista");

		Historia antigua = new Historia("123","Historia Antigua","Carlos");
		Matematicas matematicas = new Matematicas("222","Matematica 2","Juan");
		Geografia geo = new Geografia("333","Geografia 2","Pedro");
			
		biblioteca.agregarLibro(0, geo);
		biblioteca.agregarLibro(1, matematicas);
		biblioteca.agregarLibro(2, antigua);
		
		biblioteca.prestarLibro(geo, antonella,0);
		biblioteca.prestarLibro(matematicas, antonella,1);
		biblioteca.prestarLibro(antigua, antonella,2);
		
		assertFalse(biblioteca.prestarLibro(antigua, antonella,2));
		
	}
}