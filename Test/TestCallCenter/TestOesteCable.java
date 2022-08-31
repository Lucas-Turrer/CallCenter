package TestCallCenter;

import static org.junit.Assert.*;

import org.junit.Test;

import unlam.pb2.BaseDeDatos;
import unlam.pb2.Contacto;
import unlam.pb2.Operador;
import unlam.pb2.Provincia;

public class TestOesteCable {

	@Test
	public void QueSeCreaUnOperador() {
		Operador operador1 = new Operador ("Matias", "Gomez", 001);
		assertNotNull(operador1);
	}
	
	@Test
	public void QueSeCreaUnContacto() {
		Contacto contacto = new Contacto ("Lucas", "Turrer", "+5401125258899", "lt@gmail.com", 1704, Provincia.BsAs, "No", "Si");
		assertNotNull(contacto);
	}
	
	@Test
	public void QueSeQuiereRealizarUnaNuevaLlamada() {
		Contacto contacto = new Contacto ("Lucas", "Turrer", "+5401125258899", "lt@gmail.com", 1704, Provincia.BsAs, "Si", "Si");
		Contacto contacto2 = new Contacto ("Rodrigo", "Perez", "+5401125258899", "rp@gmail.com", 1704, Provincia.BsAs, "No", "Si");
		Operador operador1 = new Operador ("Matias", "Gomez", 001);
		BaseDeDatos oesteCableColor = new BaseDeDatos();
		
		oesteCableColor.agregarContactoALaBaseDeDatos(contacto);
		oesteCableColor.agregarContactoALaBaseDeDatos(contacto2);
		System.out.println(oesteCableColor.realizarNuevaLlamada());
	}
	
	@Test
	public void QueLaLlamadaFueExitosa() {
		Contacto contacto = new Contacto ("Lucas", "Turrer", "+5401125258899", "lt@gmail.com", 1704, Provincia.BsAs, "Si", "Si");
		Contacto contacto2 = new Contacto ("Rodrigo", "Perez", "+5401125258899", "rp@gmail.com", 1704, Provincia.BsAs, "No", "Si");
		Operador operador1 = new Operador ("Matias", "Gomez", 001);
		BaseDeDatos oesteCableColor = new BaseDeDatos();
		
		oesteCableColor.agregarContactoALaBaseDeDatos(contacto);
		oesteCableColor.agregarContactoALaBaseDeDatos(contacto2);
		
		oesteCableColor.llamadaExitosa(oesteCableColor.realizarNuevaLlamada());
		System.out.println(oesteCableColor.realizarNuevaLlamada());
	}
	
	@Test
	public void QueSeBusqueSiEsCliente() {
		Contacto contacto = new Contacto ("Lucas", "Turrer", "+5401125258899", "lt@gmail.com", 1704, Provincia.BsAs, "No", "Si");
		BaseDeDatos oesteCableColor = new BaseDeDatos();
		
		oesteCableColor.agregarContactoALaBaseDeDatos(contacto);
		
		oesteCableColor.llamadaExitosa(oesteCableColor.realizarNuevaLlamada());
		
		Boolean valorObtenido = oesteCableColor.verificarCliente(contacto);
		Boolean valorEsperado = true;
		
		assertEquals(valorEsperado, valorObtenido);
	}

}
